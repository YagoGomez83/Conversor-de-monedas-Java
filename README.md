

# Conversor de Monedas - Java

Este proyecto es un **conversor de monedas** desarrollado en Java que utiliza la [ExchangeRate-API](https://www.exchangerate-api.com/docs/overview) para realizar conversiones en tiempo real entre diversas monedas. La aplicación cuenta con una interfaz de usuario en consola, fácil de usar, que permite seleccionar diferentes pares de monedas.

## Tabla de Contenidos
- [Características](#características)
- [Requisitos Previos](#requisitos-previos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [API](#api)
- [Ejemplo de Uso](#ejemplo-de-uso)
- [Contribuciones](#contribuciones)
- [Licencia](#licencia)

## Características
- Conversión en tiempo real entre múltiples monedas.
- Soporte para varias opciones de pares de conversión.
- Estructura del código orientada a la separación de responsabilidades (interfaz, servicio de API y modelo).
- Interfaz de usuario amigable en consola.

## Requisitos Previos
- **Java** 8 o superior.
- Biblioteca **Gson** para el manejo de datos JSON.
- Clave de acceso a [ExchangeRate-API](https://www.exchangerate-api.com/) (regístrate para obtener una clave gratuita).

## Instalación

1. Clona este repositorio en tu máquina local:
   ```bash
   git clone https://github.com/YagoGomez83/Conversor-de-monedas-Java.git
   cd Conversor-de-monedas-Java
   ```

2. Agrega la biblioteca Gson a tu proyecto:
   - Descarga el archivo `gson-<version>.jar` de [Gson](https://github.com/google/gson).
   - Colócalo en una carpeta llamada `libs` dentro de tu proyecto.
   - Agrega el archivo `.jar` como biblioteca en IntelliJ o en tu configuración de compilación preferida.

3. Obtén una clave de la [ExchangeRate-API](https://www.exchangerate-api.com/) y reemplaza `"YOUR_API_KEY"` en el archivo `ServicioAPI.java` por tu clave.

## Uso
1. Ejecuta la clase principal `Principal` para iniciar el programa.
2. Sigue las instrucciones en la consola para seleccionar el par de monedas que deseas convertir.
3. Los resultados de la conversión se mostrarán en la pantalla.

## Estructura del Proyecto

```
com/alura/desafio
├── interfaz
│   └── Interfaz.java          # Gestión de la interfaz de usuario en consola
├── servicio
│   └── ServicioAPI.java       # Lógica para conectar y consultar la API de tipo de cambio
├── principal
│   └── Principal.java         # Clase principal para iniciar el programa
└── modelo
    └── ConversorMoneda.java   # Clase para realizar la conversión de monedas
```

- **Interfaz**: Maneja el menú de usuario y captura las selecciones de monedas.
- **ServicioAPI**: Realiza la solicitud de datos de tipo de cambio a la API externa.
- **ConversorMoneda**: Realiza las conversiones y muestra los resultados al usuario.

## API
Este proyecto utiliza la [ExchangeRate-API](https://www.exchangerate-api.com/docs/overview) para obtener los tipos de cambio en tiempo real. Asegúrate de obtener tu clave de API y configurarla en el archivo `ServicioAPI.java`.

## Ejemplo de Uso

```plaintext
***********************
1) Dólar => Peso Argentino
2) Peso Argentino => Dólar
3) Dólar => Real Brasileño
4) Real Brasileño => Dólar
5) Dólar => Peso Colombiano
6) Peso Colombiano => Dólar
7) Salir
Seleccione una opción:
```

**Ejemplo de salida**:

```plaintext
1 USD equivale a 349.50 ARS
```

## Contribuciones
Si quieres contribuir a este proyecto, sigue estos pasos:
1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b nombre-rama`).
3. Haz tus cambios y realiza un commit (`git commit -m 'Descripción de cambios'`).
4. Haz push a la rama (`git push origin nombre-rama`).
5. Abre un Pull Request.

## Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.


