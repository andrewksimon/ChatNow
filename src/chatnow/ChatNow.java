/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chatnow;

//Main driver function of the Chat now program.
public class ChatNow {

    //Main function for the entire program.
    public static void main(String[] args) {
        
        //Set focus to the Login Form.
        new ChatNowClientLoginGUI().setVisible(true);
        
    }
    
    
    //We're going to need to define 2 types. The Login GUI will create a VerfiyUser Object.
    //Verfiy user will contain the Username and Password.
    //If it is found, signal the Login GUI to close, and open the Chat Client.
    //Once the Chat Client is open, have the server return the user specific information.
    public class VerfiyUser {
    
        String _userName;
        String _userPassword;
    
        //Default Constructor
    
    
    
    
}
    
    
    
    
    
}




