package com.example.loginwithfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment() {
    private lateinit var emailIF : EditText
    private lateinit var passwordIF : EditText
    private lateinit var loginBTN : Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        emailIF = view.findViewById(R.id.emailInput)
        passwordIF = view.findViewById(R.id.passwordInput)
        loginBTN = view.findViewById(R.id.loginButton)

        loginBTN.setOnClickListener {
            val email = emailIF.text.toString()
            val password = passwordIF.text.toString()

            // TODO: Validation Needed

            val bundle = Bundle().apply {
                putString("email_value",email)
            }
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment,bundle)
        }
    }

}