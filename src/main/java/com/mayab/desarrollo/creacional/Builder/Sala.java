package com.mayab.desarrollo.creacional.Builder;

public class Sala {
    private boolean sofa4;
    private boolean sofa3;
    private boolean sofa2;
    private boolean sofa1;
    private boolean mesaCentro;
    private boolean mesaLateral;
    private boolean lampara;

    public static class Builder {
        private boolean sofa4;
        private boolean sofa3;
        private boolean sofa2;
        private boolean sofa1;
        private boolean mesaCentro;
        private boolean mesaLateral;
        private boolean lampara;

        public Builder() {}

        public Builder withSofa4(boolean sofa4) {
            this.sofa4 = sofa4;
            return this;
        }

        public Builder withSofa3(boolean sofa3) {
            this.sofa3 = sofa3;
            return this;
        }

        public Builder withSofa2(boolean sofa2) {
            this.sofa2 = sofa2;
            return this;
        }

        public Builder withSofa1(boolean sofa1) {
            this.sofa1 = sofa1;
            return this;
        }

        public Builder withMesaCentro(boolean mesaCentro) {
            this.mesaCentro = mesaCentro;
            return this;
        }

        public Builder withMesaLateral(boolean mesaLateral) {
            this.mesaLateral = mesaLateral;
            return this;
        }

        public Builder withLampara(boolean lampara) {
            this.lampara = lampara;
            return this;
        }

        public Sala build() {
            Sala sala = new Sala();
            sala.sofa4 = this.sofa4;
            sala.sofa3 = this.sofa3;
            sala.sofa2 = this.sofa2;
            sala.sofa1 = this.sofa1;
            sala.mesaCentro = this.mesaCentro;
            sala.mesaLateral = this.mesaLateral;
            sala.lampara = this.lampara;
            return sala;
        }
    }

    private Sala() {}

    public boolean hasSofa4() {
        return sofa4;
    }

    public boolean hasSofa3() {
        return sofa3;
    }

    public boolean hasSofa2() {
        return sofa2;
    }

    public boolean hasSofa1() {
        return sofa1;
    }

    public boolean hasMesaCentro() {
        return mesaCentro;
    }

    public boolean hasMesaLateral() {
        return mesaLateral;
    }

    public boolean hasLampara() {
        return lampara;
    }
}

/*
Este código define una clase Sala que utiliza el patrón de diseño Builder.
La clase Sala tiene varias propiedades booleanas que representan los diferentes componentes de una sala (sofa4, sofa3, sofa2, sofa1, mesaCentro, mesaLateral y lampara).
La clase Builder, que se define dentro de la clase Sala, se utiliza para construir objetos de la clase Sala de manera más clara y concisa.
Cada método dentro de la clase Builder (con nombres como withSofa4, withSofa3, withMesaCentro, etc.) establece el valor de una propiedad booleana de la clase Sala y devuelve una referencia al propio objeto Builder, lo que permite encadenar múltiples métodos con una sintaxis muy legible.
El método build() de la clase Builder crea finalmente una instancia de la clase Sala y devuelve esta instancia.
Los valores de las propiedades booleanas se copian en el objeto Sala que se está construyendo.
En el constructor privado de la clase Sala, no se toman argumentos, ya que todas las propiedades booleanas se establecen utilizando la clase Builder.
Los métodos públicos hasSofa4(), hasSofa3(), hasSofa2(), hasSofa1(), hasMesaCentro(), hasMesaLateral() y hasLampara() simplemente devuelven los valores de las propiedades booleanas correspondientes de la clase Sala.
 */