# Cities API

## Objetivos
Desenvolver uma API REST de consulta de cidades do Brasil com dados comparativos. 
Navegar pela boas práticas de Java e Spring Boot, popular o banco de dados PostgreSQL, criar serviço para cálculo de distâncias.

## Tecnologias utilizadas
 + Java 11
 + Spring Boot 2.4.5
 + Postman
 + Github

## Como testar
Para testar essa API é preciso ter Java versão 11 devidamente instalado. A API foi desenvolvida e configurada para utilizar banco de dados PostgreSQL. É preciso fazer as devidas alterações caso deseje utilizar outro SGBD.
Com Java 11 e banco de dados configurados:
 + Clonar este repositório
 + Abrir o projeto em sua IDE preferida.
 + Alterar as configurações do arquivo `src/main/resources/application-sample.properties`.
 + Salvar este arquivo, renomeando-o para `src/main/resources/application.properties`.
 + Executar o projeto.

Com o projeto em execução, os requests podem ser feitos utilizando-se Postman ou similar.

## Endpoints & Payloads
### Endpoints
#### Países
**Ação** | **Endpoint gRPC** | **Método equivalente HTTP**
---------- | ------------ | ----------
Listar todos | _/api/v1/countries/_ | GET
Listar por id | _/api/v1/countries/{id}_ | GET

#### Estados
**Ação** | **Endpoint gRPC** | **Método equivalente HTTP**
---------- | ------------ | ----------
Listar todos | _/api/v1/states/_ | GET
Listar por id | _/api/v1/states/{id}_ | GET

#### Cidades
**Ação** | **Endpoint gRPC** | **Método equivalente HTTP**
---------- | ------------ | ----------
Listar todos | _/api/v1/cities/_ | GET
Listar por id | _/api/v1/cities/{id}_ | GET

#### Distâncias
**Ação** | **Endpoint gRPC** | **Método equivalente HTTP**
---------- | ------------ | ----------
Calcular distância | _/api/v1/distances/by-math?from={id1}&to={id2}&unit=KILOMETERS_ | GET

### Payloads
#### Países
##### GET - List all (response)
    {
        "content": [
            {
                "id": 2,
                "name": "Afghanistan",
                "portugueseName": "Afeganistão",
                "code": "AF",
                "bacen": 132
            },
            {
                "id": 253,
                "name": "Åland Islands",
                "portugueseName": "Aland, Ilhas",
                "code": "AX",
                "bacen": 153
            },
            {
                "id": 3,
                "name": "Albania",
                "portugueseName": "Albânia, Republica da",
                "code": "AL",
                "bacen": 175
            },
            {
                "id": 4,
                "name": "Algeria",
                "portugueseName": "Argélia",
                "code": "DZ",
                "bacen": 590
            },
            {
                "id": 5,
                "name": "American Samoa",
                "portugueseName": "Samoa Americana",
                "code": "AS",
                "bacen": 6912
            },
            {
                "id": 6,
                "name": "Andorra",
                "portugueseName": "Andorra",
                "code": "AD",
                "bacen": 370
            },
            {
                "id": 7,
                "name": "Angola",
                "portugueseName": "Angola",
                "code": "AO",
                "bacen": 400
            },
            {
                "id": 8,
                "name": "Anguilla",
                "portugueseName": "Anguilla",
                "code": "AI",
                "bacen": 418
            },
            {
                "id": 9,
                "name": "Antarctica",
                "portugueseName": "Antártida",
                "code": "AQ",
                "bacen": 3596
            },
            {
                "id": 259,
                "name": "Antartica",
                "portugueseName": "Antartica",
                "code": "AQ",
                "bacen": 420
            },
            {
                "id": 10,
                "name": "Antigua and Barbuda",
                "portugueseName": "Antigua e Barbuda",
                "code": "AG",
                "bacen": 434
            },
            {
                "id": 11,
                "name": "Argentina",
                "portugueseName": "Argentina",
                "code": "AR",
                "bacen": 639
            },
            {
                "id": 12,
                "name": "Armenia",
                "portugueseName": "Armênia, Republica da",
                "code": "AM",
                "bacen": 647
            },
            {
                "id": 13,
                "name": "Aruba",
                "portugueseName": "Aruba",
                "code": "AW",
                "bacen": 655
            },
            {
                "id": 14,
                "name": "Australia",
                "portugueseName": "Austrália",
                "code": "AU",
                "bacen": 698
            },
            {
                "id": 15,
                "name": "Austria",
                "portugueseName": "Áustria",
                "code": "AT",
                "bacen": 728
            },
            {
                "id": 16,
                "name": "Azerbaijan",
                "portugueseName": "Azerbaijão, Republica do",
                "code": "AZ",
                "bacen": 736
            },
            {
                "id": 17,
                "name": "Bahamas",
                "portugueseName": "Bahamas, Ilhas",
                "code": "BS",
                "bacen": 779
            },
            {
                "id": 18,
                "name": "Bahrain",
                "portugueseName": "Bahrein, Ilhas",
                "code": "BH",
                "bacen": 809
            },
            {
                "id": 240,
                "name": "Bailiwick of Guernsey",
                "portugueseName": "Guernsey, Ilha do Canal (Inclui Alderney e Sark)",
                "code": "GG",
                "bacen": 1504
            }
        ],
        "pageable": {
            "sort": {
                "sorted": true,
                "unsorted": false,
                "empty": false
            },
            "offset": 0,
            "pageNumber": 0,
            "pageSize": 20,
            "paged": true,
            "unpaged": false
        },
        "last": false,
        "totalPages": 13,
        "totalElements": 255,
        "size": 20,
        "number": 0,
        "sort": {
            "sorted": true,
            "unsorted": false,
            "empty": false
        },
        "first": true,
        "numberOfElements": 20,
        "empty": false
    }

##### GET - Find by id (response)
    {
        "id": 10,
        "name": "Antigua and Barbuda",
        "portugueseName": "Antigua e Barbuda",
        "code": "AG",
        "bacen": 434
    }

#### Estados
##### GET - List all (response)
    [
        {
            "id": 1,
            "name": "Acre",
            "uf": "AC",
            "ibge": 12,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                68
            ]
        },
        {
            "id": 2,
            "name": "Alagoas",
            "uf": "AL",
            "ibge": 27,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                82
            ]
        },
        {
            "id": 3,
            "name": "Amazonas",
            "uf": "AM",
            "ibge": 13,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                97,
                92
            ]
        },
        {
            "id": 4,
            "name": "Amapá",
            "uf": "AP",
            "ibge": 16,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                96
            ]
        },
        {
            "id": 5,
            "name": "Bahia",
            "uf": "BA",
            "ibge": 29,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                77,
                75,
                73,
                74,
                71
            ]
        },
        {
            "id": 6,
            "name": "Ceará",
            "uf": "CE",
            "ibge": 23,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                88,
                85
            ]
        },
        {
            "id": 7,
            "name": "Distrito Federal",
            "uf": "DF",
            "ibge": 53,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                61
            ]
        },
        {
            "id": 8,
            "name": "Espírito Santo",
            "uf": "ES",
            "ibge": 32,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                28,
                27
            ]
        },
        {
            "id": 9,
            "name": "Goiás",
            "uf": "GO",
            "ibge": 52,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                62,
                64,
                61
            ]
        },
        {
            "id": 10,
            "name": "Maranhão",
            "uf": "MA",
            "ibge": 21,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                99,
                98
            ]
        },
        {
            "id": 11,
            "name": "Minas Gerais",
            "uf": "MG",
            "ibge": 31,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                34,
                37,
                31,
                33,
                35,
                38,
                32
            ]
        },
        {
            "id": 12,
            "name": "Mato Grosso do Sul",
            "uf": "MS",
            "ibge": 50,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                67
            ]
        },
        {
            "id": 13,
            "name": "Mato Grosso",
            "uf": "MT",
            "ibge": 51,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                65,
                66
            ]
        },
        {
            "id": 14,
            "name": "Pará",
            "uf": "PA",
            "ibge": 15,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                91,
                94,
                93
            ]
        },
        {
            "id": 15,
            "name": "Paraíba",
            "uf": "PB",
            "ibge": 25,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                83
            ]
        },
        {
            "id": 16,
            "name": "Pernambuco",
            "uf": "PE",
            "ibge": 26,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                81,
                87
            ]
        },
        {
            "id": 17,
            "name": "Piauí",
            "uf": "PI",
            "ibge": 22,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                89,
                86
            ]
        },
        {
            "id": 18,
            "name": "Paraná",
            "uf": "PR",
            "ibge": 41,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                43,
                41,
                42,
                44,
                45,
                46
            ]
        },
        {
            "id": 19,
            "name": "Rio de Janeiro",
            "uf": "RJ",
            "ibge": 33,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                24,
                22,
                21
            ]
        },
        {
            "id": 20,
            "name": "Rio Grande do Norte",
            "uf": "RN",
            "ibge": 24,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                84
            ]
        },
        {
            "id": 21,
            "name": "Rondônia",
            "uf": "RO",
            "ibge": 11,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                69
            ]
        },
        {
            "id": 22,
            "name": "Roraima",
            "uf": "RR",
            "ibge": 14,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                95
            ]
        },
        {
            "id": 23,
            "name": "Rio Grande do Sul",
            "uf": "RS",
            "ibge": 43,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                53,
                54,
                55,
                51
            ]
        },
        {
            "id": 24,
            "name": "Santa Catarina",
            "uf": "SC",
            "ibge": 42,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                47,
                48,
                49
            ]
        },
        {
            "id": 25,
            "name": "Sergipe",
            "uf": "SE",
            "ibge": 28,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                79
            ]
        },
        {
            "id": 26,
            "name": "São Paulo",
            "uf": "SP",
            "ibge": 35,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                11,
                12,
                13,
                14,
                15,
                16,
                17,
                18,
                19
            ]
        },
        {
            "id": 27,
            "name": "Tocantins",
            "uf": "TO",
            "ibge": 17,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                63
            ]
        },
        {
            "id": 99,
            "name": "Exterior",
            "uf": "EX",
            "ibge": 99,
            "country": null,
            "ddd": null
        }
    ]

##### GET - Find by id
    {
        "id": 1,
        "name": "Acre",
        "uf": "AC",
        "ibge": 12,
        "country": {
            "id": 1,
            "name": "Brazil",
            "portugueseName": "Brasil",
            "code": "BR",
            "bacen": 1058
        },
        "ddd": [
            68
        ]
    }

#### Cidades
##### GET - List all (response)
    {
        "content": [
            {
                "id": 1,
                "name": "Afonso Cláudio",
                "uf": 8,
                "ibge": 3200102,
                "geolocation": "(-20.0778007507324,-41.1260986328125)",
                "location": {
                    "x": -20.0778007507324,
                    "y": -41.1260986328125
                }
            },
            {
                "id": 2,
                "name": "Água Doce do Norte",
                "uf": 8,
                "ibge": 3200169,
                "geolocation": "(-18.5482006072998,-40.9854011535645)",
                "location": {
                    "x": -18.5482006072998,
                    "y": -40.9854011535645
                }
            },
            {
                "id": 3,
                "name": "Águia Branca",
                "uf": 8,
                "ibge": 3200136,
                "geolocation": "(-18.9846000671387,-40.7436981201172)",
                "location": {
                    "x": -18.9846000671387,
                    "y": -40.7436981201172
                }
            },
            {
                "id": 4,
                "name": "Alegre",
                "uf": 8,
                "ibge": 3200201,
                "geolocation": "(-20.757999420166,-41.538200378418)",
                "location": {
                    "x": -20.757999420166,
                    "y": -41.538200378418
                }
            },
            {
                "id": 5,
                "name": "Alfredo Chaves",
                "uf": 8,
                "ibge": 3200300,
                "geolocation": "(-20.6396007537842,-40.7542991638184)",
                "location": {
                    "x": -20.6396007537842,
                    "y": -40.7542991638184
                }
            },
            {
                "id": 6,
                "name": "Alto Rio Novo",
                "uf": 8,
                "ibge": 3200359,
                "geolocation": "(-19.0618000030518,-41.0209007263184)",
                "location": {
                    "x": -19.0618000030518,
                    "y": -41.0209007263184
                }
            },
            {
                "id": 7,
                "name": "Anchieta",
                "uf": 8,
                "ibge": 3200409,
                "geolocation": "(-20.7954998016357,-40.6425018310547)",
                "location": {
                    "x": -20.7954998016357,
                    "y": -40.6425018310547
                }
            },
            {
                "id": 8,
                "name": "Apiacá",
                "uf": 8,
                "ibge": 3200508,
                "geolocation": "(-21.1522998809814,-41.5693016052246)",
                "location": {
                    "x": -21.1522998809814,
                    "y": -41.5693016052246
                }
            },
            {
                "id": 9,
                "name": "Aracruz",
                "uf": 8,
                "ibge": 3200607,
                "geolocation": "(-19.8199996948242,-40.2764015197754)",
                "location": {
                    "x": -19.8199996948242,
                    "y": -40.2764015197754
                }
            },
            {
                "id": 10,
                "name": "Atilio Vivacqua",
                "uf": 8,
                "ibge": 3200706,
                "geolocation": "(-20.9130001068115,-41.198600769043)",
                "location": {
                    "x": -20.9130001068115,
                    "y": -41.198600769043
                }
            },
            {
                "id": 11,
                "name": "Baixo Guandu",
                "uf": 8,
                "ibge": 3200805,
                "geolocation": "(-19.5212993621826,-41.0108985900879)",
                "location": {
                    "x": -19.5212993621826,
                    "y": -41.0108985900879
                }
            },
            {
                "id": 12,
                "name": "Barra de São Francisco",
                "uf": 8,
                "ibge": 3200904,
                "geolocation": "(-18.7548007965088,-40.8964996337891)",
                "location": {
                    "x": -18.7548007965088,
                    "y": -40.8964996337891
                }
            },
            {
                "id": 13,
                "name": "Boa Esperança",
                "uf": 8,
                "ibge": 3201001,
                "geolocation": "(-18.5394992828369,-40.3025016784668)",
                "location": {
                    "x": -18.5394992828369,
                    "y": -40.3025016784668
                }
            }
        ]
    }

##### GET - find by id (response)
    {
        "id": 5270,
        "name": "São Paulo",
        "uf": 26,
        "ibge": 3550308,
        "geolocation": "(-23.5328998565674,-46.6394996643066)",
        "location": {
            "x": -23.5328998565674,
            "y": -46.6394996643066
        }
    }

#### Distâncias
##### GET - distance by math (response)
    449.12599025489806


