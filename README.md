Conversor de Monedas

Descripción

El Conversor de Monedas es una aplicación de consola escrita en Java que permite realizar conversiones de monedas en tiempo real utilizando la API de ExchangeRate-API. La aplicación ofrece una experiencia simple y rápida para convertir entre diferentes monedas comunes.

Características Principales

Conversión entre Colones (CRC) y Dólares (USD).

Conversión entre Real Brasileño (BRL) y Dólares (USD).

Guarda todas las conversiones realizadas en un archivo JSON para futuras referencias.

Implementación robusta de manejo de excepciones para garantizar la estabilidad.

Uso de la biblioteca Gson para el manejo de datos en formato JSON.

Requisitos

Java: Versión 11 o superior.

IntelliJ IDEA (u otro IDE compatible con Java).

API Key de ExchangeRate-API para realizar las consultas de tasas de cambio.

Instalación y Configuración

1. Clonar el Repositorio

Clona el repositorio desde GitHub: https://github.com/JeanRodriguezdev/Conversor-de-monedas.git



2. Configurar la API Key

La aplicación utiliza una API Key para conectarse a ExchangeRate-API. Puedes configurarla de dos maneras:

Como Variable de Entorno:

Crea una variable de entorno llamada api_key y asígnale tu API Key.

Directamente en el Código (para pruebas):

Edita la clase ConsultarConversion y reemplaza System.getenv("api_key") con tu API Key entre comillas:

private String APIKEY = "TU_API_KEY";

3. Configurar Gson

Asegúrate de que el archivo gson-2.10.1.jar esté en la carpeta lib y que esté agregado como una biblioteca en tu proyecto.

4. Ejecutar la Aplicación

Abre el proyecto en IntelliJ IDEA.

Ejecuta la clase Main desde el IDE.
