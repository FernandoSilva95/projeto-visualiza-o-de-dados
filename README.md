# Projeto
Módulo de visualização de dados administrativos (dataviz)

# Proposta do projeto

Implementar um sistema web para visualização de dados utilizando uma biblioteca gráfica. A aplicação deve ser capaz de:
• Ler informações de um banco de dados.
• Processar os dados e exibi-los em gráficos interativos.
• Permitir que o usuário selecione diferentes tipos de filtros para a realização do acesso aos dados da maneira que lhe for preferida.

# Implementação da tabela no banco de Dados

Foi definido pela equipe que os dados do PIB do Brasil seriam utilizados para o projeto, desde a conversão da moeda para o real até os dias atuais. O website do IBGE permitiu realizar o download de uma tabela do Excel que foi posteriormente importada na conexão com o banco de dados. 

A conexão escolhida foi do tipo SQLite, que permitiu o compartilhamento do arquivo entre a equipe. A tabela do Banco de Dados ainda precisou de manipulação, com a retirada dos pontos contidos entre os números maiores (exemplo 8.967.236) com o objetivo de facilitar a leitura dos dados pelo gráfico criado no FrontEnd. O comando utilizado para realizar a alteração descrita se deu por: UPDATE data_basepib set PIB_Anual = REPLACE(PIB_Anual, '.', '')

# Construção da API

A API constitui parte do BackEnd do projeto e tem o propósito de solicitar o banco de dados através de certos comandos para que posteriormente os mesmos possam ser acessados na interface do usuário por meio da biblioteca gráfica.

O projeto foi do tipo Maven, baixado a partir do Spring Initializr com o acréscimo de algumas dependências para o auxílio durante a criação do projeto. A API foi desenvolvida com a ferramenta Spring Boot que é uma estrutura da linguagem de programação Java. A mesma constituía uma interface “Repository” e as classes “Application”, “Controller” e “Entity”, onde o Repository realiza a chamada para o banco de dados, o Entity possui as características de cada coluna da tabela juntamente com os getters and setters, o Controller vai ter a definição das chamadas por URL assim como os Endpoints e o Application é responsável por rodar o projeto. Durante a criação do projeto, foi definido que a API teria os seguintes Endpoints:

Últimos 5 anos, responsável pelo caminho de URL “/pib-5”;
Últimos 10 anos, responsável pelo caminho de URL “/pib-10”;
E uma listagem de todos os anos, responsável pelo caminho de URL “/pib-all”;

# Estruturação do HTML (Hypertext Markup Language)

O HTML foi o primeiro passo para o desenvolvimento do FrontEnd do projeto. Nele foram acrescentadas bibliotecas e a estrutura que a página web viria a ter quando finalizada.

# Implementação do CSS(Cascading Style Sheets)

A partir dos dados inseridos no HTML, foi desenvolvido através da interface com CSS o design da página criada. O CSS usa seletores para aplicar estilos a elementos HTML, esses seletores podem ser baseados em nomes de tags, IDs, classes ou atributos dos elementos HTML. A aparência da página web foi decidida pelo grupo a partir de pesquisar de outras páginas que continham DataViz como inspiração, já que em nosso grupo era ausente a presença de alguém com a skill de design gráfico.

# Consumindo os Endpoints da API utilizando Fetch

A documentação do Fetch API – MDN foi escolhida para auxiliar na conexão do FrontEnd com a API. O fetch é uma função que permite realizar as requisições de rede pré-definidas pela API (como exemplo, nosso “/pib-all” que traria os dados de todos os PIB de uma vez). Essa requisição HTTP
é dada pelo comando GET dentro do código em Java no BackEnd.

# Implementação do Gráfico em JavaScript

A linguagem de programação JavaScript foi a terceira e última fase do nosso conjunto de FrontEnd. Neste código foram implementados filtros que fizeram a chamada dos Endpoints da API em conjunto com a implementação do gráfico com o auxílio da biblioteca gráfica Highcharts. Apesar de ser possível desenhar os formatos e criar a tabela manualmente no código, o uso de uma biblioteca virtual diminui o tempo de criação do gráfico e torna o dia a dia do desenvolvedor de software mais eficiente. Dentre os artifícios de bibliotecas gráficas que existem hoje na internet o escolhido pelo grupo foi o Highcharts pela praticidade e fácil acesso do mesmo.

# A escolha do Highcharts

Interatividade e Flexibilidade: O Highcharts oferece gráficos altamente interativos e configuráveis, permitindo que os usuários explorem os dados de maneira intuitiva e detalhada.
Compatibilidade: Funciona bem em diferentes navegadores e dispositivos, garantindo uma experiência de usuário consistente.
Desempenho: É otimizado para lidar com grandes volumes de dados de forma eficiente, garantindo que os gráficos carreguem rapidamente e permaneçam responsivos.

# Links úteis

https://spring.io/guides/tutorials/rest/
https://flask.palletsprojects.com
https://www.highcharts.com/
https://d3js.org/"