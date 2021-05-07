$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/DocumentoWeb.feature");
formatter.feature({
  "line": 1,
  "name": "Creacion de documento",
  "description": "",
  "id": "creacion-de-documento",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Creacion de un documento web",
  "description": "",
  "id": "creacion-de-documento;creacion-de-un-documento-web",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@crearDocumento"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Redireccion a la vista del buscador de Google \"https://www.google.com/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com/",
      "offset": 47
    }
  ],
  "location": "StepDefinitionsDocumentoWeb.redireccion_a_la_vista_del_buscador_de_Google(String)"
});
formatter.result({
  "duration": 12197391101,
  "status": "passed"
});
});