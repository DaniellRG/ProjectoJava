/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usuarioo;

/**
 *
 * @author Dsoul
 */
public class Usuarioo {

    public static class Usuario {

        private final int id;
        private final String user;
        private final String pass;
        private final int idProfile;

        public Usuario(int id, String user, String pass, int idProfile) {
            this.id = id;
            this.user = user;
            this.pass = pass;
            this.idProfile = idProfile;
        }

        public int getId() {
            return id;
        }

        public String getUser() {
            return user;
        }

        public String getPass() {
            return pass;
        }

        public int getIdProfile() {
            return idProfile;
        }

    }

}
