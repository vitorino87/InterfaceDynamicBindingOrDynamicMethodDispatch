/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedynamicbindingordynamicmethoddispatch;

/**
 *
 * @author tiago.lucas
 */
public class InterfaceDynamicBindingOrDynamicMethodDispatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a1;
        a1 = new B();
        a1.showA();
        
        a1 = new C();
        a1.showA();
    }
    
}
