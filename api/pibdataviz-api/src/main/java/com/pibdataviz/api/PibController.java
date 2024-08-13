package com.pibdataviz.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PibController {
	
	private final PibRepository repository;
	private final PibAnoRepository repositoryYear;
	
	@Autowired
	PibController(PibRepository repository, PibAnoRepository repositoryYear) {
		this.repository = repository;
		this.repositoryYear = repositoryYear;
	}

	@GetMapping("/pib-5-trimester")
	List<PibEntity> lastFiveYearsTrimester() {
		return repository.findAll().stream().filter(x -> x.getAno() >= 2019 && !Objects.equals(x.getPIB_Anual(), "")).toList();
	}

	@GetMapping("/pib-10-trimester")
	List<PibEntity> lastTenYearsTrimester() {
		return repository.findAll().stream().filter(x -> x.getAno() >= 2014 && !Objects.equals(x.getPIB_Anual(), "")).toList();
	}

	@GetMapping("/pib-all-trimester")
	List<PibEntity> lastAllYearsTrimester() {
		return repository.findAll().stream().filter(x -> x.getAno() >= 1996 && !Objects.equals(x.getPIB_Anual(), "")).toList();
	}
	
	@GetMapping("/pib-all")
	List<PibAnoEntity> getAllPib() {
		return repositoryYear.getAllPib();
	}
	
	@GetMapping("/pib-5")
	List<PibAnoEntity> lastFiveYears() {
		return repositoryYear.lastFiveYears();
	}
	
	@GetMapping("/pib-10")
	List<PibAnoEntity> lastTenYears() {
		return repositoryYear.lastTenYears();
	}
	
	@GetMapping("/annual-pib/{year}")
	@ResponseBody
	public String getAnnualPib(@PathVariable String year) {

		List<PibEntity> listaPib = repository.findAll();
		

		List<PibEntity> listaFiltrada = new ArrayList<PibEntity>();
		for (PibEntity pib : listaPib) {
			if (pib.getTrimestre().contains(year) == true) {
				listaFiltrada.add(pib);
			}
		}
		
		double pibAnual = 0;
		for(PibEntity pib : listaFiltrada) {
			pibAnual = pibAnual + Double.parseDouble(pib.getPibTrimestral());
		}
		
		return "Pib Anual:" + pibAnual;
	}	
	
	@GetMapping("/annual-trimestral-pib/{year}/{trimester}")
	@ResponseBody
	public PibEntity getPibByYearAndTrim(@PathVariable String year, @PathVariable String trimester) {
		List<PibEntity> listaPib = repository.findAll();
		for(PibEntity pib : listaPib) {
			if(
				pib.getTrimestre().contains(year) &&
				pib.getTrimestre().contains(trimester)
			) {
				return pib;
			}
		}
		return null;
	}
	
	@GetMapping("/taxes-by-trimester-pib/{year}/{trimester}")
	@ResponseBody
	public String getTaxes(@PathVariable String year, @PathVariable String trimester) {
		List<PibEntity> listaPib = repository.findAll();
		for(PibEntity pib : listaPib) {
			if(
				pib.getTrimestre().contains(year) &&
				pib.getTrimestre().contains(trimester)
			) {
				
				return pib.getImposto();
			}
		}
		return null;
	}
	
	@GetMapping("/pib-variable/{year}/{trimester}")
	@ResponseBody
	public String getVariable(@PathVariable String year, @PathVariable String trimester) {
		List<PibEntity> listaPib = repository.findAll();
		for(PibEntity pib : listaPib) {
			if(
				pib.getTrimestre().contains(year) &&
				pib.getTrimestre().contains(trimester)
			) {
				
				return pib.getVa();
			}
		}
		return null;
	}

}
