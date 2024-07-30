// //
// public class Classroom2 {
//     static class Node {
//         Node[] children;
//         boolean eow;

//         public Node() {
//             children = new Node [26];//a to z
//             for(int i=0; i<26; i++) {
//                 children[i] = null;
//             }
//             eow = false;
//         // 
//     }
//     static Node root = new Node();

//     public static void insert(String word) {
//         Node curr = root;
//         for(int i=0; i<word.length(); i++) { //o(L)
//             int idx = word.charAt(i) - 'a';

//             if (curr.children[idx] == null) {
//                 //add new node
//                 curr.children[idx] = new Node();
                
//             }
//             if(i == word.length() - 1) {
//                 curr.children[idx].eow = true;

//             }
//             curr = curr.children[idx];

//         }
//     }
//     public static boolean search(String key) {
//         Node curr = root;
//         for(int i=0; i<key.length(); i++){ //O(L); L = key length
//             int idx = key.charAt(i) - 'a';
//             Node node = curr.children[idx];

//             if(node == null) {
//                 return false;
//             }
//             if(i == key.length()-1 && node.eow == false) {
//                 return false;
//             }
//             curr = curr.children[idx];

//         }
//         return true;
//     }
//     public static String ans = "";
//     public static void longestword(Node root, StringBuilder temp) {
//         if(root == null) {
//             return;
//         }
//         for(int i=0; i<26; i++) {
//             if(root.children[i] != null && root.children[i].eow == true) {
//                 temp.append((char)(i+'a'));
//                 if(temp.length() > ans.length()) {
//                     ans = temp.toString();
//                 }
//                 longestword(root.children[i], temp);
//                 temp.deleteCharAt(temp.length()-1);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         String word[] = {"a", "banana", "app", "appl", " ap", "apply", "apple"};//unique substring
//         for(int i=0; i<word.length; i++) {
//             insert(word[i]);
//         }
//         longestword(root, new StringBuilder(str:""));
//         System.out.println(ans);
        
//     }
    
// }
// Longest word with all prefixes 
// words =["a","banana", "app", "appl","ap","apply","apple"]
//ans = "apple"
public class Classroom2 {
    static class Node {
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26]; // a to z
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) { // O(L)
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                // add new node
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) { // O(L); L = key length
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if (node == null) {
                return false;
            }
            if (i == key.length() - 1 && !node.eow) {
                return false;
            }
            curr = node;
        }
        return true;
    }

    public static String ans = "";

    public static void longestword(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow) {
                temp.append((char) (i + 'a'));
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestword(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"}; // unique substring
        for (String word : words) {
            insert(word);
        }
        longestword(root, new StringBuilder());
        System.out.println(ans);
    }
}
