# Consumo de la API de la NASA - Proyecto APOD

Este repositorio contiene una aplicación Java diseñada para consumir el servicio APOD (Astronomy Picture of the Day) de la NASA. El proyecto se centra en la gestión de peticiones HTTP, el procesamiento de datos en formato JSON y el manejo de parámetros dinámicos en la URL.

## Descripción del Proyecto
La aplicación realiza una consulta automatizada a los servidores de la NASA. Se ha implementado una lógica de generación de fechas aleatorias para modificar la consulta original, permitiendo recuperar diferentes registros históricos de la base de datos de la NASA en cada ejecución.

## Objetivos y Criterios de Evaluación (RA1)
El desarrollo cumple con los siguientes puntos del currículo:
- **RA1.c**: Instalación y configuración del entorno de desarrollo (Visual Studio Code) y gestión de librerías externas.
- **RA1.f**: Análisis de la estructura de la aplicación e identificación de las clases necesarias para el consumo de servicios REST.
- **RA1.g**: Modificación de código preexistente para la inclusión de parámetros de consulta dinámicos.
- **RA1.h**: Comprobación del funcionamiento mediante la salida por consola del entorno.

## Tecnologías y Librerías
- **Java SE**: Lenguaje principal.
- **JSON-java (org.json)**: Librería para el parseo de la respuesta del servidor.
- **HttpURLConnection**: Clase nativa de Java para la gestión de la conexión.

## Configuración e Instalación
1. Clonar el repositorio.
2. Añadir el archivo `json-20231013.jar` (o versión compatible) al Classpath del proyecto.
3. En Visual Studio Code, asegurar que la librería aparece en la sección "Referenced Libraries".
4. Configurar la clave de API en la constante `API_KEY` dentro de la clase `NasaService`.

## Ejemplo de Salida
Al ejecutar el programa, se obtiene una respuesta estructurada similar a la siguiente:
- Fecha generada: 2022-05-15
- Título: [Título de la imagen astronómica]
- URL: [Enlace directo al recurso multimedia]
