# 🚗 Sistema de Gestión de Taller Automotriz

Sistema integral de gestión para talleres automotrices desarrollado con arquitectura de microservicios usando Spring Boot y Spring Cloud.

## 🏗️ Arquitectura del Sistema

El sistema está compuesto por **7 microservicios** que trabajan de manera coordinada para gestionar todas las operaciones de un taller automotriz:

### 🔧 Microservicios Principales

#### 1. **Eureka Server** (`251dswSpringBackendEureka`)
- **Función**: Servidor de descubrimiento de servicios
- **Responsabilidad**: Registra y descubre todos los microservicios del sistema
- **Tecnología**: Spring Cloud Netflix Eureka

#### 2. **API Gateway** (`251dswSpringBackendGateway`)
- **Función**: Puerta de entrada única para todas las APIs
- **Responsabilidad**: 
  - Enrutamiento de peticiones
  - Configuración CORS
  - Balanceo de carga
- **Tecnología**: Spring Cloud Gateway

#### 3. **Config Server** (`251dswSpringBackendConfig`)
- **Función**: Servidor de configuración centralizada
- **Responsabilidad**: Gestiona configuraciones de todos los microservicios
- **Tecnología**: Spring Cloud Config

#### 4. **Taller Automotriz** (`251dswSpringBackendTallerAutomotriz`)
- **Función**: Microservicio principal de gestión del taller
- **Responsabilidades**:
  - 🔐 **Autenticación y Autorización**: Registro, login y gestión de usuarios
  - 🚗 **Gestión de Vehículos**: CRUD de autos, marcas, modelos
  - 👥 **Gestión de Personas**: Clientes, técnicos, supervisores
  - 📋 **Órdenes de Servicio (OST)**: Creación y gestión de órdenes
  - 💰 **Cotizaciones**: Generación y gestión de cotizaciones
  - 🛠️ **Servicios y Materiales**: Catálogo de servicios y materiales
  - 📊 **Inventario**: Control de inventario de vehículos
  - 🔧 **Asignación de Técnicos**: Gestión de técnicos por marca
  - 📝 **Bitácora de Problemas**: Registro de problemas técnicos

#### 5. **Órdenes de Servicio** (`251dswSpringBackendOrdenServicio`)
- **Función**: Gestión especializada de órdenes de servicio
- **Responsabilidades**:
  - 📋 **Gestión de OST**: Creación, actualización y seguimiento
  - 🔍 **Evidencias Técnicas**: Almacenamiento de evidencias
  - 👨‍🔧 **Asignación de Técnicos**: Gestión de técnicos por OST
  - 📊 **Inventario por OST**: Control de inventario específico
  - ❓ **Preguntas y Categorías**: Sistema de preguntas técnicas

#### 6. **Taller Ventas** (`251dswSpringBackendTallerVentas`)
- **Función**: Gestión de ventas y satisfacción del cliente
- **Responsabilidades**:
  - 📊 **Dashboard**: Métricas y reportes de ventas
  - 📝 **Encuestas de Satisfacción**: Evaluación post-servicio
  - 💳 **Recibos**: Generación y gestión de recibos
  - ⭐ **Evaluaciones**: Sistema de calificaciones
  - 📈 **Reportes**: Análisis de satisfacción del cliente

#### 7. **Cotizaciones** (`251dswSpringBackendCotizacion`)
- **Función**: Gestión especializada de cotizaciones
- **Responsabilidades**:
  - 💰 **Cotizaciones**: Generación y gestión
  - ⏰ **Expiración**: Control de tiempos de expiración
  - 📊 **Estados**: Seguimiento de estados de cotización

## 🚀 Tecnologías Utilizadas

- **Java 17**
- **Spring Boot 3.3.0**
- **Spring Cloud 2023.0.2**
- **Spring Security** (JWT)
- **Spring Data JPA**
- **Maven**
- **Lombok**
- **Feign Client** (Comunicación entre microservicios)

## 🔄 Flujo de Trabajo del Sistema

### 1. **Registro y Autenticación**
- Registro de clientes y técnicos
- Login con JWT
- Gestión de roles y permisos

### 2. **Gestión de Vehículos**
- Registro de autos por cliente
- Asociación de marcas y modelos
- Control de inventario de vehículos

### 3. **Órdenes de Servicio**
- Creación de OST por vehículo
- Asignación de técnicos especializados
- Seguimiento de estados
- Registro de evidencias técnicas

### 4. **Cotizaciones**
- Generación automática de cotizaciones
- Agregado de servicios y materiales
- Control de expiración
- Estados de pago

### 5. **Servicio al Cliente**
- Encuestas de satisfacción
- Evaluaciones post-servicio
- Generación de recibos
- Dashboard de métricas

## 📊 Características Principales

- ✅ **Arquitectura de Microservicios** escalable
- ✅ **Autenticación JWT** segura
- ✅ **Comunicación entre servicios** con Feign
- ✅ **Configuración centralizada**
- ✅ **Descubrimiento de servicios** automático
- ✅ **API Gateway** unificado
- ✅ **Gestión completa de talleres automotrices**
- ✅ **Sistema de cotizaciones** con expiración
- ✅ **Encuestas de satisfacción** integradas
- ✅ **Dashboard** con métricas en tiempo real

## 🛠️ Instalación y Configuración

### Prerrequisitos
- Java 17
- Maven 3.6+
- Base de datos compatible con JPA

### Pasos de Instalación
1. Clonar el repositorio
2. Configurar la base de datos
3. Ejecutar los microservicios en el siguiente orden:
   - Config Server
   - Eureka Server
   - API Gateway
   - Microservicios de negocio

## 📝 Licencia

Este proyecto está desarrollado como parte de un taller académico de desarrollo de software.

---
