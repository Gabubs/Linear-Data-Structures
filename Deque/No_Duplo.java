public class No_Duplo {
   // Modulo geral
   class Node {
       private Object value;
       Node next;
       Node prev;


       public Node(Object value) {
           this.value = value;
           this.next = null;
           this.prev = null;
       }
   }
   //
   private Node head;
   private Node tail;
   private int size = 0;


   public No_Duplo() {
       this.head = null;
       this.tail = null;
   }


   public void inserirInicio(Object value) { // Push Front
       Node newNode = new Node(value);
       newNode.next = this.head;
       newNode.prev = null;


       if (this.head == null) {
           this.tail = newNode;
       } else {
           this.head.prev = newNode;
       }


       this.head = newNode;
       this.size++;
   }




   public Object removerInicio() { // Pop Front
       if (size == 0)
           throw new RuntimeException("Deque Vazio!");
       Object o = this.head.value;
       this.head = this.head.next;
       if (this.head == null)
           this.tail = null;
       else
           this.head.prev = null;


       this.size--;
       return o;
   }
   public void inserirFim(Object value) { // Push Back
       Node newNode = new Node(value);


       if (this.head == null)
           this.head = newNode;
       else {
           this.tail.next = newNode;
           newNode.prev = this.tail;
       }
       this.tail = newNode;
       this.size++;
   }
   public Object removerFim() { // Pop_Back
       if (size == 0)
           throw new RuntimeException("Deque Vazio!");
       Object o = this.tail.value;


       this.tail = this.tail.prev;
       if (this.tail == null) {
           this.head = null;
       } else
           this.tail.next = null;
       size--;
       return o;
   }
   // AUXILIARES
   public Object primeiro() {
       if (size == 0)
           throw new RuntimeException("Deque Vazio!");
       return this.head.value;
   }
   public Object ultimo() {
       if (size == 0)
           throw new RuntimeException("Deque Vazio!");
       return  this.tail.value;
   }
   public int tamanho() {
       return this.size;
   }
   public boolean estaVazia() {
       return  this.size == 0;
   }
}
