# isa2025-healthcalc
Health calculator used in Ingeniería del Software Avanzada

Se desea desarrollar una calculadora que permita estimar varios parámetros de salud de una persona, como su peso ideal, su tasa metabólica basal, entre otras funciones. Se recomienda usar la **Tabla de contenido** para visualizar las practicas por separado.

<details>
  <summary>Indice de Contenido</summary>
   <ol>
    <li><a href="#Practica1">Practica1</a>
      <ol> <li><a href="#Introducción">Introducción practica1</a></li>
        <li><a href="#Desarrollo">Desarrollo de tests</a></li>
        <li><a href="#test_idealWeight">Test idealWeight</a></li>
        <li><a href="#test_basalMetabolicRate">Test basalMetabolicRate</a></li>
        <li><a href="#Ejecución">Ejecución de los test</a></li>
        <li><a href="#Repositorio">Desarrollo del repositorio practica1</a></li></ol> </li>
   </ol>
</details>

# Práctica 1

<a name="Practica1"></a>

<a name="Introducción"></a>
# Introducción:
Dicho repositorio forma parte de las actividades de la asignatura "Ingeniería de software Avanzada" correspondiendo a la parte practica, [Partiendo de este repositorio](https://github.com/jmhorcas/isa2025-healthcalc.git)

Se busca desarrollar una herramienta de cálculo de salud que, utilizando datos como la estatura, el peso, la edad y el sexo, permita estimar valores como el peso óptimo y la tasa metabólica basal.

* `idealWeight`: Obtiene la altura y el género como entrada, y su salida es el **peso ideal**.
* `basalMetabolicRate`: Obtiene el peso, la altura, el género y la edad como entrada, y su salida es el **metabolismo basal**.  

 **IMPORTANTE** NO HE UTILIZADO LA FORMULA DADA YA QUE ME DABA ERROR, HE COGIDO LA FORMULA DE WIKIPEDIA

<a name="Desarrollo"></a>  
#  Desarrollo de tests:

El **testing** es un proceso clave en el desarrollo de software, ya que permite detectar y corregir errores antes de que afecten a los usuarios. Su importancia radica en varios factores:

Garantiza la calidad del software: Asegura que la aplicación funcione correctamente bajo diferentes condiciones y cumpla con los requisitos establecidos.

Reduce costos y tiempo de desarrollo: Detectar errores en etapas tempranas evita problemas más costosos de corregir en fases avanzadas o después del lanzamiento.

Previene riesgos en aplicaciones críticas: En sectores como la salud, finanzas o seguridad, el testing es vital para evitar errores que puedan generar daños o pérdidas significativas.
Mejora la experiencia del usuario: Un software libre de fallos mejora la usabilidad y la satisfacción de quienes lo utilizan.

Facilita el mantenimiento y escalabilidad: Un código bien probado permite realizar cambios y agregar nuevas funciones sin comprometer el funcionamiento existente.




<a name="Ejecución"></a>
# Ejecución de los test:
A continuación, se muestra una captura con los resultados de todas las pruebas exitosas. Para más detalles, se pueden revisar las imágenes almacenadas en la carpeta "images", donde se encuentran capturas de mayor calidad y con información más específica.

En total, se han implementado 12 pruebas, incluyendo algunas parametrizadas. Todas las pruebas se han ejecutado correctamente y cumplen con los objetivos establecidos desde el inicio.

Abra con su IDE el fichero “TEST-healthcalc.HealthCalcTest.xml” dentro de la carpeta “target/surefire-reports” que contiene el resultado de ejecutar los tests.

<p align="center">
<img src="https://github.com/marcosLlopis/isa2025-healthcalc/tree/main/image.png" width="100" title="Test">
</p>

![](https://github.com/marcosLlopis/isa2025-healthcalc/tree/main/image.png)


![alt text](image-1.png)
<a name="Repositorio"> </a>
# Desarrollo del repositorio:
Durante el laboratorio, se utilizo `git` para trabajar de manera cómoda, eficiente y segura, pudiendo publicar continuamente los avances del proyecto, metodología muy útil para tener una mayor perspectiva de la linealidad del proyecto y poder retroceder en caso de equivocaciones.

