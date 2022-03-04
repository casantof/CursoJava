public class CalcuCaja {
    
    int ancho;
    int alto;
    int profundo;
    
        public CalcuCaja(){
            System.out.println("Ejecutando el constructor vacio ");
        }
    
        public CalcuCaja(int a, int b, int c){
            
            this.ancho    = a;
            this.alto     = b;
            this.profundo = c;
            
            System.out.println("Ejecutando constructor con 3 argumentos");
        }
        
        public int area(){
        
            return this.ancho * this.alto * this.profundo;
        }
        
        public int area(int a, int b, int c){
            return a * b * c;
        }
}
