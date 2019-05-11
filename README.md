# CONGRUENCIAL MIXTO
_En el siguiente proyecto se crea un programa sencillo en Java usando JOptionPane, para 
encontrar numeros aleatorios mediante el metodo congruencial mixto_

Para obtener el codigo del Congruencial Multiplicativo en Java: https://github.com/JonnathanE/CongruencialMultiplicativo
## Manual de Uso
**1. SELECCION DE OPCIONES**

_Al Iniciar el programa se encuentra con un seleccionador de opciones
, el cual debe ingresar el numero correspondiente:_

![Selección_053](https://user-images.githubusercontent.com/33469147/57563244-582ee100-7361-11e9-91bc-6f0257fb8ff1.png)

- ***Opcion 1:*** En esta opcion se calculara el multiplicador (`a = 1 + 4K`) y el modulo (`m = 2^g`) mediante sus formulas.
En el caso del multiplicador se pedira que ingrese el valor de 'k' y para el modulo se pedira que ingrese el valor de
'g'

- ***Opcion 2:*** En esta opcion el usuario debera ingresar los valores finales de `m`, `a`, `x0` y `C`

- ***Opcion 3:*** Esta opcion sirve para terminar el programa

**2.  OPCION 1**

- Primero debe ingresar el valor de la semilla.

![1y1](https://user-images.githubusercontent.com/33469147/57563249-70066500-7361-11e9-8205-85947e934f6f.png)

- Para calcular el multiplicador(`a`), se debe ingresar el valor de la variable `k` e internamente se aplicara la 
formula `a = 1 + 4K`.

![1y3](https://user-images.githubusercontent.com/33469147/57563255-8e6c6080-7361-11e9-87d2-6d910e569084.png)

- Despues de esto se debe de ingresar la constante aditiva (`c`). Debe de ser un numero entero  impar.

![1y4](https://user-images.githubusercontent.com/33469147/57563261-9d531300-7361-11e9-9afd-c2cde256846b.png)

- Por ultimo para calcular el modulo (`m`), se debe ingresar el valor de la variable `g` de acuerdo a la formula `m = 2^g`. Debe ser un numero entero.

![1y5](https://user-images.githubusercontent.com/33469147/57563263-a93ed500-7361-11e9-823e-10b38de75134.png)

- El resultado aparece el la consola(Se eligio la consola sebido a que JOptionPane no muestra grandes cantidades de informacion)

![1y6](https://user-images.githubusercontent.com/33469147/57563272-b78cf100-7361-11e9-9bc7-6769f278cf00.png)

**3. OPCION 2**

- Primero debe ingresar el valor de la semilla.

![2y1](https://user-images.githubusercontent.com/33469147/57563279-c673a380-7361-11e9-90cc-063c1b1c6448.png)

- Ingresamos el valor final del multiplicador (`a`).

![2y2](https://user-images.githubusercontent.com/33469147/57563282-cffd0b80-7361-11e9-967e-5acb0e1b4f0b.png)

- Ingresamos el valor de la constante (`c`).

![2y3](https://user-images.githubusercontent.com/33469147/57563286-da1f0a00-7361-11e9-9f1f-9c63a1b10a3b.png)

- Ingresamos el valor final del modulo (`m`).

![2y4](https://user-images.githubusercontent.com/33469147/57563291-e3a87200-7361-11e9-93c5-fc78ca00d88c.png)

- El resultado aparece el la consola(Se eligio la consola sebido a que JOptionPane no muestra grandes cantidades de informacion)

![2y5](https://user-images.githubusercontent.com/33469147/57563297-eefb9d80-7361-11e9-982e-79cd1af818e9.png)
