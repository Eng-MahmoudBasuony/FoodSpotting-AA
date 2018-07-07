package com.example.eng_mahnoud83coffey.embeatitserver.Service;

import com.example.eng_mahnoud83coffey.embeatitserver.Common.Common;
import com.example.eng_mahnoud83coffey.embeatitserver.Model.Token;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseIdService extends FirebaseInstanceIdService
{


    @Override
    public void onTokenRefresh()
    {
        super.onTokenRefresh();

        String token= FirebaseInstanceId.getInstance().getToken();


            updateTokenServer(token);

    }

    private void updateTokenServer(String token)
    {

        FirebaseDatabase db=FirebaseDatabase.getInstance();
        DatabaseReference referenceToken=db.getReference("Tokens");


        Token token1=new Token(token,true); //parser isServerToken True because Customers

        referenceToken.child(Common.currentUser.getPhone()).setValue(token1);

    }




}
