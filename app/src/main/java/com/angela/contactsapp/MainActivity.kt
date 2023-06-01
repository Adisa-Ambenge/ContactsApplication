package com.angela.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.angela.contactsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }

    fun displayContacts() {

        val contact1 = ContactData("Angela", "0713030706", "ambengeangela@gmail.com", "")
        val contact2 = ContactData("Adisa", "0797196522", "adisa@gmail.com", "")
        val contact3 = ContactData("Allan", "0703259286", "ambenge@gmail.com", "")
        val contact4 = ContactData("Emily", "0716636825", "karegi@gmail.com", "")
        val contact5 = ContactData("Linda", "0719395019", "kayinzili@gmail.com", "")
        val contact6 = ContactData("Brenda", "0719592688", "kamede@gmail.com", "")
        val contact7 = ContactData("Vinnie", "0727470737", "ambengeangela@gmail.com", "")
        val contact8 = ContactData("Jesse", "0723456789", "kalange@gmail.com", "")
        val contact9 = ContactData("Mike", "0713456789", "swahili@gmail.com", "")
        val contact10 = ContactData("Musa", "0727668216", "musaambenge@gmail.com", "")
        val contactList = listOf<ContactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        var contact = ContactAdapter(contactList)
        binding.rvContact.adapter = contact
    }
}

