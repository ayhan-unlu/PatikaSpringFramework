package com.ayhanunlu.cdi;


import javax.enterprise.context.*;
import javax.inject.Named;
import java.io.Serializable;

// coverage, life length of the object created
// affects performance + or -
@Named
//@ApplicationScoped // during the application is on.for whole users
//@RequestScoped // during the request
//@SessionScoped//during a user is logged in. when logout it ends. implements Serializable is required.
//@Dependent // depends on the scope that the class is using the currently.
//@ConversationScoped // lives during the request or conversation on. product is added to the cart and products existance is ended as the payment done. implements Serializable is required.
//@SessionScoped // singleton to make bean a single instance
public class _00_Scoped  {
}
