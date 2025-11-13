package controller;
import java.util.*;

public class MainLab {

    public static void main(String[] args) {

        // BLOCO A 

        // Tarefa 1
        List<Integer> numeros = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));
        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);
        System.out.println("A posição do número 8 é: " + Collections.binarySearch(numeros, 8));
        Collections.reverse(numeros);
        System.out.println("A lista revertida é: " + numeros);
        Collections.shuffle(numeros);
        System.out.println("A lista embaralhada é: " + numeros);

        // Tarefa 2
        List<String> l1 = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
        List<String> l2 = new ArrayList<>(Arrays.asList("C#", "Java", "Go"));
        Collections.addAll(l1, "Kotlin", "Swift");
        System.out.println("A lista agora: " + l1);
        int freq = Collections.frequency(l1, "Java");
        System.out.println("A frequência da palavra Java é: " + freq);
        boolean disjuntas = Collections.disjoint(l1, l2);
        System.out.println("As duas listas não têm algo em comum? " + disjuntas);
        List<Integer> listaMM = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("O mínimo da lista é: " + Collections.min(listaMM));
        System.out.println("O máximo da lista é: " + Collections.max(listaMM));

        // BLOCO B 

        // Tarefa 1 
        Stack<String> pilha = new Stack<>();
        pilha.push("((2+3)*(4-1))");
        pilha.push(")(2+3)(");
        pilha.push("(1+(2*3)");

        while (!pilha.isEmpty()) {
            String expr = pilha.pop();
            System.out.println(expr + (estaBalanceada(expr) ? " Balanceada" : " Desbalanceada"));
        }

        // Tarefa 2
        String palavra = "ALGORITMO";
        Stack<Character> pilhaChar = new Stack<>();

        for (char c : palavra.toCharArray()) {
            pilhaChar.push(c);
        }

        String invertida = "";
        while (!pilhaChar.isEmpty()) {
            invertida += pilhaChar.pop();
        }

        System.out.println("Original: " + palavra);
        System.out.println("Invertida: " + invertida);

        // BLOCO C 

        // Tarefa 1 
        PriorityQueue<String> fila = new PriorityQueue<>();
        fila.offer("Doc1");
        fila.offer("Doc2");
        fila.offer("Doc3");
        System.out.println("Fila ordenada automaticamente: " + fila);

        while (fila.size() > 1) {
            System.out.println("Maior prioridade: " + fila.peek());
            System.out.println("Removendo: " + fila.poll());
        }

        fila.offer("Doc4");
        System.out.println("Fila ordenada automaticamente: " + fila);
        fila.clear();
        System.out.println("Fila após clear: " + fila);

        // Tarefa 2
        PriorityQueue<Integer> numeros3 = new PriorityQueue<>(Comparator.reverseOrder());
        numeros3.offer(30);
        numeros3.offer(10);
        numeros3.offer(20);
        numeros3.offer(40);

        while (!numeros3.isEmpty()) {
            System.out.println("Topo: " + numeros3.peek());
            System.out.println("Removendo: " + numeros3.poll());
        }

        // BLOCO D 

        // Tarefa 1
        Set<String> linguagens = new HashSet<>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("C++");
        linguagens.add("Java");
        System.out.println("Lista ordenada automaticamente: " + linguagens);

        SortedSet<Integer> numeros1 = new TreeSet<>(Arrays.asList(10, 5, 8, 1));
        System.out.println("Ordenado: " + numeros1);
        System.out.println("Menores que 8: " + numeros1.headSet(8));
        System.out.println("Maiores ou iguais a 8: " + numeros1.tailSet(8));

        // Tarefa 2
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Ana", 90);
        notas.put("Carlos", 80);
        notas.put("Bianca", 85);

        System.out.println("Mapa: " + notas);
        System.out.println("Nota de Ana: " + notas.get("Ana"));
        System.out.println("Chaves: " + notas.keySet());
        System.out.println("Tamanho: " + notas.size());

        SortedMap<String, Integer> ordenado = new TreeMap<>(notas);
        System.out.println("Ordenado por chave: " + ordenado);

        // BLOCO E 

    
    }

    // tarefa 2 BLOCO B
    public static boolean estaBalanceada(String s) {
        Stack<Character> p = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                p.push(c);
            } else if (c == ')') {
                if (p.isEmpty())
                    return false;
                p.pop();
            }
        }
        return p.isEmpty();
    }
    
    @SuppressWarnings("unused")
	private static void blocoE() {
        System.out.println("\n--- Bloco E: Lista Encadeada & Árvore de Busca ---");

        // Tarefa E1 - Exibir LinkedList antes e após cada operação
        System.out.println("-> E1: Lista Encadeada com LinkedList");
        LinkedList<Integer> lista = new LinkedList<>();
        lista.addFirst(1);
        lista.addLast(5);
        lista.addFirst(3);
        lista.addLast(7);
        System.out.println("Lista inicial: " + lista);

        lista.removeFirst();
        System.out.println("Lista após remover do início: " + lista);

        lista.removeLast();
        System.out.println("Lista após remover do fim: " + lista);

        // Tarefa E2 -- Árvore de Busca
        System.out.println("\n--- Bloco E2: Árvore de Busca Binária ---");
        BST bst = new BST();

        // Inserções na BST
        int[] valores = {8, 3, 10, 1, 6, 14, 4, 7, 13};
        for (int valor : valores) {
            bst.insert(valor);
        }

        // Percursos
        System.out.print("In-Order: ");
        bst.inOrder();

        System.out.print("Pre-Order: ");
        bst.preOrder();

        System.out.print("Post-Order: ");
        bst.postOrder();
    }

    static class BST {
        static class Node { int v; Node l, r; Node(int v) { this.v = v; } }
        Node r;
        void insert(int v) { r = insert(r, v); }
        Node insert(Node n, int v) {
            if (n == null) return new Node(v);
            if (v < n.v) n.l = insert(n.l, v);
            else if (v > n.v) n.r = insert(n.r, v);
            return n;
        }
        void inOrder() { inOrder(r); System.out.println(); }
        void preOrder() { preOrder(r); System.out.println(); }
        void postOrder() { postOrder(r); System.out.println(); }
        void inOrder(Node n) { if (n != null) { inOrder(n.l); System.out.print(n.v + " "); inOrder(n.r); } }
        void preOrder(Node n) { if (n != null) { System.out.print(n.v + " "); preOrder(n.l); preOrder(n.r); } }
        void postOrder(Node n) { if (n != null) { postOrder(n.l); postOrder(n.r); System.out.print(n.v + " "); } }
    }

    
}
