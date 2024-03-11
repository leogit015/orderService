package entities;

import java.util.HashMap;
import java.util.Map;

public class Admin {
    
    private Map<String, String> usuarios = new HashMap<>();

    
    public void adicionarUsuario(String username, String password) {
        usuarios.put(username, password);
    }

    
    public boolean autenticarUsuario(String username, String password) {
        
        return usuarios.containsKey(username) && usuarios.get(username).equals(password);
    }

    public static void main(String[] args) {
       
        Admin admin = new Admin();

       
        admin.adicionarUsuario("usuario1", "senha1");
        admin.adicionarUsuario("usuario2", "senha2");
        admin.adicionarUsuario("funcionario1", "252422");

       
        String username = "usuario1";
        String password = "senha1";
        if (admin.autenticarUsuario(username, password)) {
            System.out.println("Login bem-sucedido para o usuário: " + username);
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }
    }
}

