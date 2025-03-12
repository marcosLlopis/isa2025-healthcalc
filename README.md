# isa2025-healthcalc
Health calculator used in Ingeniería del Software Avanzada

Se desea desarrollar una calculadora que permita estimar varios parámetros de salud de una persona, como su peso ideal, su tasa metabólica basal, entre otras funciones. Se recomienda usar la **Tabla de contenido** para visualizar las practicas por separado.

<details>
  <summary>Indice de Contenido</summary>
   <ol>
    <li><a href="#Práctica1">Practica1</a>
      <ol> <li><a href="#Introducción">Introducción practica1</a></li>
        <li><a href="#desarrollo">Desarrollo de tests</a></li>
        <li><a href="#test_idealWeight">Test idealWeight</a></li>
        <li><a href="#test_basalMetabolicRate">Test basalMetabolicRate</a></li>
        <li><a href="#ejecucion">Ejecución de los test</a></li>
        <li><a href="#repo">Desarrollo del repositorio practica1</a></li></ol> </li>
   </ol>
</details>

# Práctica 1 
<a name="Práctica1"></a>

<a name="Introducción"></a>>
#Introducción
A partir de este repositorio[https://github.com/jmhorcas/isa2025-healthcalc.git], se busca desarrollar una herramienta de cálculo de salud que, utilizando datos como la estatura, el peso, la edad y el sexo, permita estimar valores como el peso óptimo y la tasa metabólica basal.

¿Que es el peso optimo y la tasa metabolica basal?
* `idealWeight`: Obtiene la altura y el género como entrada, y su salida es el **peso ideal**.
* `basalMetabolicRate`: Obtiene el peso, la altura, el género y la edad como entrada, y su salida es el **metabolismo basal**.

<a name="desarrollo"></a>  
#  Desarrollo de tests:
Las pruebas de software son esenciales para garantizar calidad, precisión y seguridad. Permiten detectar errores temprano, evitar fallos críticos en cálculos de salud, asegurar el correcto funcionamiento y facilitar futuras actualizaciones sin introducir nuevos problemas.

Reduce costos y tiempo de desarrollo: Detectar errores en etapas tempranas evita problemas más costosos de corregir en fases avanzadas o después del lanzamiento.
Para una calculadora de salud, el testing es esencial para garantizar que los cálculos, como el peso ideal o la tasa metabólica basal, sean precisos y fiables en todos los casos.

He desarrollado varios test para cada método con el fin de ver si hay algún fallo en el código.

<a name="test_idealWeight"></a>
## Test para el método idealWeight():




<a name="ejecucion"></a>
# Ejecución de los test:
A continuación una captura de todos los test pasados, para obtener más información se puede entrar en la carpeta de images donde se encuentran las fotos en mejor calidad y más detalladas, los test fueron pasados y cumplen con todos los objetivos planeados inicialmente. He implementado 21 test en total, algunos parametrizados.
<p align="center">
  <img src="https://github.com/Diegodepab/isa2024-healthcalc/blob/main/Images/TODOS_los_test.png" width="400" title="TODOS_LOS_TEST">
</p>