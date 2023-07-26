¿Cuántas clases tiene el proyecto?
- ¿En cuál clase se define el programa principal
- ¿Cuántos objetos de la clase Animal se crean en la clase
principal?
- ¿Cuántos y cuáles son los atributos de la clase Animal?
- ¿Cuáles atributos de la clase Animal no son primitivos?
- ¿Qué pasa si eliminamos la línea 17 de la clase Zoologico?
- ¿Cuántos métodos tiene la clase Familia?
- ¿Cuántos parámetros tiene el método tenerHijo() de la clase
Familia?
- ¿Cuántos atributos inicializa el constructor de la clase Familia?
- ¿Qué tipo de retorno tiene el método tenerHijo()?

solucion

1/ El proyecto tiene 3 clases
2/ Se define en la clase Zoologico
3/ protected String nombre;
   protected String genero;
   protected double peso;
   protected Animal pareja;

4/Serian nombre,genero,peso,pareja
5/ protected String nombre;
   protected String genero;
   protected Animal pareja;

6/Al eliminar esta linea haria conflicto al no poder encontrar pareja porque no se puede ejecutar correctamente el metodo y no nos mandaria una excepciones


7/ imprimirFamilia(){}
   tenerHijo(String nombre){}

8/Solo contiene este parametro (String nombre)

9/Este inicializa 2:  this.papa = papa;
                      this.mama = mama;

10/Su retorno es  public void 