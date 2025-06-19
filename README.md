# 💱 Conversor de Moneda - Proyecto Back-End en Java

Aplicación de consola desarrollada en Java que permite consultar y convertir valores entre distintas divisas usando datos actualizados desde una API pública.

---

## 🔧 Funcionalidades principales

- Consulta en línea del tipo de cambio entre monedas (USD, CLP, EUR, GBP).
- Conversión automática según monto ingresado por el usuario.
- Menú interactivo por consola para elegir tipo de conversión.
- Validación de entradas: evita letras, valores negativos o opciones fuera de rango.
- Registro automático de cada conversión realizada (con fecha, monedas y resultado).
- Historial guardado en archivo `registro_conversiones.txt`.

---

## 📌 Tecnologías utilizadas

- **Lenguaje**: Java 17+
- **API externa**: [ExchangeRate-API](https://www.exchangerate-api.com/)
- **Librería JSON**: Gson (`com.google.code.gson`)
- **IDE**: IntelliJ IDEA
- **Control de versiones**: Git + GitHub

---

## 🗂 Estructura del proyecto

```
ConversorDeMoneda/
├── src/
│   ├── Moneda.java                  # Clase principal (main)
│   ├── MenuUsuario.java             # Menú interactivo por consola
│   ├── ConsultaDivisas.java         # Conexión a API y parseo JSON
│   ├── RegistroConversiones.java    # Registro y almacenamiento de conversiones
│   └── Divisas.java                 # Record para modelar datos de la API
├── registro_conversiones.txt        # Archivo generado con historial
└── README.md
```

---

## 📝 Ejemplo de uso

```
Ingrese su opción (1-7): 1
Ingrese el monto en USD: 100

Resultado: 100.00 USD = 93428.31 CLP
Última actualización: Mon, 17 Jun 2025 00:00:01 +0000

Registro: [2025-06-16 23:45:12] 100.00 USD → 93428.31 CLP (actualizado: Mon, 17 Jun 2025 00:00:01 +0000)
```

---

## 📁 Registro de conversiones

Cada conversión se guarda automáticamente en el archivo `registro_conversiones.txt` con la siguiente estructura:

```
[YYYY-MM-DD HH:MM:SS] <monto> <origen> → <resultado> <destino> (actualizado: <fecha API>)
```

---

## 🛠 Posibles mejoras futuras

- Filtros en historial por fecha o moneda
- Interfaz gráfica o versión web (usando Spring Boot)
- Exportación a CSV
- Integración con base de datos

---

## 🚀 Cómo ejecutar

1. Clonar el repositorio:
```bash
git clone https://github.com/GoCuevas/ConversorDeMoneda.git
```

2. Abrir en IntelliJ IDEA o tu IDE preferido.

3. Ejecutar `Moneda.java`.

---

## 📬 Autor

**Gonzalo Cuevas**  
Estudiante de Back-End en desarrollo  
GitHub: [@GoCuevas](https://github.com/GoCuevas)
