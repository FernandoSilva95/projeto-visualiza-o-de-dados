# M08
Criar um módulo de visualização de dados administrativos (dataviz)

# Contexto do projeto

Em diversos sistemas web que desenvolvemos para clientes reais há a necessidade de criação de um módulo (pode ser uma página web) de administração do sistema. Neste módulo podemos disponibilizar diversos dados sobre a saúde do sistema. Entre alguns desses dados, podemos exemplificar: tempo médio e maior tempo de execução dos processos executados em background para atualização automática de informações do sistema; Quantidade de registros de determinada tabela do banco de dados (geralmente em torno do objetivo principal do sistema); agregação de dados; entre outros detalhes.

# Objetivo

Criar um sistema web bem simples, cujo objetivo principal será ler os dados que se quer manipular diretamente do banco de dados e mostrar esses dados usando uma biblioteca gráfica para visualização desses dados.

Sugestão: criar um backend para ler os dados do banco de dados para focar na visualização dos dados usando uma biblioteca gráfica (como Highcharts ou D3js). Injetar os dados diretamente no banco via SQL para disponibilizar esses dados nos gráficos desejados. Usar um framework moderno de UI (React, Vue, Angular) seria interessante, mas na ausência de pessoas com o skill nesses frameworks, o mesmo pode ser feito usando HTML, CSS e JQuery diretamente. Não gastar esforço - num primeiro momento - com a manipulação dos dados através da API, já que o foco aqui é explorar a parte de visualização dos dados.

No contexto foram dados alguns exemplos reais de dados que podem ser disponibilizados. Sugere-se aqui gastar um tempo no planejamento identificando outros possíveis dados que seriam interessantes serem disponibilizados nesse módulo administrativo e criar o modelo de dados (e o esquema do banco) com base nesses dados.

# Links úteis

https://spring.io/guides/tutorials/rest/
https://flask.palletsprojects.com
https://www.highcharts.com/
https://d3js.org/"