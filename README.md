# DEMO

Aplicacion basada en spring boot + data jpa + h2-db + maven

## Endpoints

Buscar materias:
```
  GET http://localhost:8080/subject
```
Buscar materia:
```
  GET http://localhost:8080/subject/{id}
```
Crear materia:
```
  POST http://localhost:8080/subject
  
{
	"name": "nameExample"
}
```

Buscar personas:
```
  GET http://localhost:8080/persons
```
Buscar persona:
```
  GET http://localhost:8080/persons/{id}
```
Crear Persona:
```
  POST http://localhost:8080/persons
  
{
	"name": "Pepe",
    "lastName": "Lopez",
    "email": "pepe.lopez@gmail.com",
    "isStudent": true,
    "work": {
        "occupationName": "Programador",
        "salary": 400
    },
    "subjects": [
    {
    	"name": "Sistemas Operativos"
    },
    {
    	"name": "Matematica Discreta"
    }]
}
```
Actualizar persona:
```
  PUT http://localhost:8080/persons/{id} 
```
Borrar persona:
```
  DELETE http://localhost:8080/persons/{id} 
```