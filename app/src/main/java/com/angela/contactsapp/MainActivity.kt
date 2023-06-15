package com.angela.contactsapp

import android.content.Intent
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
        binding.fbAdd.setOnClickListener {
            val intent = Intent(this,addContact::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }


    fun displayContacts() {

        val contact1 = ContactData("Angela", "0713030706", "ambengeangela@gmail.com", "https://www.istockphoto.com/photo/business-woman-manager-or-human-resources-portrait-for-career-success-company-we-are-gm1437816897-478501891?utm_source=unsplash&utm_medium=affiliate&utm_campaign=srp_photos_top&utm_content=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Fprofile-picture&utm_term=profile%20picture%3A%3A%3A")
        val contact2 = ContactData("Adisa", "0797196522", "adisa@gmail.com", "https://unsplash.com/photos/mEZ3PoFGs_k")
        val contact3 = ContactData("Allan", "0703259286", "ambenge@gmail.com", "https://unsplash.com/photos/rDEOVtE7vOs")
        val contact4 = ContactData("Emily", "0716636825", "karegi@gmail.com", "https://unsplash.com/photos/_H6wpor9mjs")
        val contact5 = ContactData("Linda", "0719395019", "kayinzili@gmail.com", "https://unsplash.com/photos/joINR2EKnvY")
        val contact6 = ContactData("Brenda", "0719592688", "kamede@gmail.com", "https://unsplash.com/photos/Fyl8sMC2j2Q")
        val contact7 = ContactData("Vinnie", "0727470737", "ambengeangela@gmail.com", "https://unsplash.com/photos/jzz_3jWMzHA")
        val contact8 = ContactData("Jesse", "0723456789", "kalange@gmail.com", "https://unsplash.com/photos/hh3ViD0r0Rc")
        val contact9 = ContactData("Mike", "0713456789", "swahili@gmail.com", "https://unsplash.com/photos/VLEyU1v7zn0")
        val contact10 = ContactData("Musa", "0727668216", "musaambenge@gmail.com", "https://www.istockphoto.com/photo/portrait-of-a-smiling-woman-sitting-outdoors-gm1257088545-368287630?utm_source=unsplash&utm_medium=affiliate&utm_campaign=srp_photos_bottom&utm_content=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Fprofile-pictures&utm_term=profile%20pictures%3A%3A%3A")
        val contactList = listOf<ContactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        val contact = ContactAdapter(contactList)
        binding.rvContact.adapter = contact
    }
}

