package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		 Admin admin = new Admin();

	        
	        admin.adicionarUsuario("usuario1", "senha1");
	        admin.adicionarUsuario("usuario2", "senha2");

	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nome de usuário: ");
	        String username = sc.nextLine();
	        System.out.print("Senha: ");
	        String password = sc.nextLine();

	        
	        if (admin.autenticarUsuario(username, password)) {
	            System.out.println("Login bem-sucedido para o usuário: " + username);
	            
	        } else {
	            System.out.println("Usuário ou senha incorretos. Tente novamente.");
	            
	        }
	    }
	}

	class Admin {
	   
	    private Map<String, String> usuarios = new HashMap<>();

	   
	    public void adicionarUsuario(String username, String password) {
	        usuarios.put(username, password);
	    }

	    // Método para autenticar um usuário
	    public boolean autenticarUsuario(String username, String password) {
	        
	        return usuarios.containsKey(username) && usuarios.get(username).equals(password);
		
		
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}
