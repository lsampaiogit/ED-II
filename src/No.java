public class No {

        private int valor;
        private int Esquerda;
        private int Direita;

        //Getters e Setters
        public void setValor(int valor2){
            this.valor = valor2;
        }
        public void setEsquerda(int esq){
            this.Esquerda = esq;
        }       
        public void setDireita(int dir){
            this.Direita = dir;
        }
        public int getValor(){
            return this.valor;
        }
        public int getEsquerda(){
            return this.Esquerda;
        }
        public int getDireita(){
            return this.Direita;
        }

        //Construtor da Árvore
        public No (int value){
            this.valor = value;
            this.Esquerda = 0;
            this.Direita = 0;
        }
        
        //MÉTODOS DE CONTROLE

        //Verificar se a árvore está vazia
        public boolean isEmpty(){
            return (this.valor == 0);
        }

        //Inserir novo elemento
        public void Inserir(int novo){
            if(isEmpty()){ //Se a árvore estiver vazia, this.valor representará a raiz.
                this.valor = novo;
            }
            else{ //Se já tiver uma raiz, o valor será adicionado a esquerda ou a direita comparado a seu nó pai.
                if(novo < this.valor){
                    this.Esquerda = novo;
                }
                else {this.Direita = novo;}
            }
        }
}