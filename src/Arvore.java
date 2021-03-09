public class Arvore {

        private Elemento ele;
        private Arvore Esquerda;
        private Arvore Direita;

        //Construtor da Árvore
        public Arvore (Elemento elem){
            this.ele = elem;
            this.Esquerda = null;
            this.Direita = null;
        }
        
        //Getters e Setters
        public void setElemento(Elemento valor){
            this.ele = valor;
        }
        public void setEsquerda(Arvore esq){
            this.Esquerda = esq;
        }       
        public void setDireita(Arvore dir){
            this.Direita = dir;
        }
        public Elemento getElemento(){
            return this.ele;
        }
        public Arvore getEsquerda(){
            return this.Esquerda;
        }
        public Arvore getDireita(){
            return this.Direita;
        }

        
        
        //MÉTODOS DE CONTROLE

        //Verificar se a árvore está vazia
        public boolean isEmpty(){
            return (this.ele == null);
        }

        //Inserir novo elemento
        public void Inserir(Elemento novo){
            if(isEmpty()){ //Se a árvore estiver vazia, this.ele representará a raiz, recebendo o novo elemento
                this.ele = novo;
            }
            else{
                Arvore novaArvore = new Arvore(novo); //cria uma nova arvore
                if(novo.getValor() < this.ele.getValor()){
                    if(this.Esquerda == null){ //É um nó folha?
                        this.Esquerda = novaArvore; //a nova árvore recebe o valor e armazena a esquerda
                }
                else{
                    this.Esquerda.Inserir(novo); //repassa a responsabilidade para a subárvore esquerda
                }
            }
        }
}