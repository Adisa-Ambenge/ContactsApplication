package com.angela.contactsapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.angela.contactsapp.databinding.ItemContactBinding
import com.squareup.picasso.Picasso
import com.squareup.picasso.RequestCreator

class ContactAdapter(var contactList:List<ContactData>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ItemContactBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contactDetails = contactList.get(position)
            val binding = holder.binding
            binding.tvName.text = contactDetails.name
            binding.tvEmail.text= contactDetails.emailAddress
            binding.tvPhoneNumber.text = contactDetails.phoneNumber
            Picasso
                .get()
                .load(contactDetails.imagePlaceholder)
                .resize(80,80)
                .centerCrop()
//                .transform(CropCircleTransformation1())
                .into(binding.ivImage)

        }
    }


    class ContactViewHolder(var binding: ItemContactBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }
