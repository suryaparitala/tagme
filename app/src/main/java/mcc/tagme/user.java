package mcc.tagme;

/**
 * Created by suryanarayana on 5/12/17.
 */
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashSet;

import static mcc.tagme.NewsFragment.positionid;

public class user {


    public String password;
    public String email;
    //public HashSet<Integer> rlist = new HashSet<Integer>();
    int registereventval;
    String imeival;
    Double longitudeval;
    Double Latitudeval;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public user() {
    }

    public user(String email, String password,int positionval, String imei, Double sharelongval , Double sharelatval) {
        this.password = password;
        this.email = email;
        this.registereventval= positionval;
        this.imeival = imei;
        this.longitudeval = sharelongval;
        this.Latitudeval = sharelatval;
    }

}
