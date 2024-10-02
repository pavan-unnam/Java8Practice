package Java8Practice.trie;
//tire data structure respents tree from similarly like treenode
//other than root node child node should have single letter
// it's mainly used in serach engines and spellcheck
public class Trie {
	
	public TrieNode root;
	
	Trie() {
		root = new TrieNode();
	}
	
	
	
	private static class TrieNode {
		
		TrieNode []  trieNode;
		boolean isWord;
		
		TrieNode() {
			trieNode = new TrieNode[26];
			isWord = false;
		}
	}
	
	public void insert(String word) {
		TrieNode current = root;
		for(int i =0; i<word.length();i++) {
			char c = word.charAt(i);
			int index = c-'a';
			if(current.trieNode[index] == null) {
				TrieNode node = new TrieNode();
				current.trieNode[index] = node;
				current = node;
			} else {
				current = current.trieNode[index];
			}
		}
		current.isWord = true;
	}

}
