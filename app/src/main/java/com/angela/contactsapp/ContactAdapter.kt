package com.angela.contactsapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.angela.contactsapp.databinding.ItemContactBinding

class ContactAdapter(var contactList:List<ContactData>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding =ItemContactBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contactDetails = contactList[position]
        holder.binding.apply {
            tvName.text = contactDetails.name
            tvEmail.text=contactDetails.emailAddress
            tvPhoneNumber.text=contactDetails.phoneNumber
        }
    }


}
class ContactViewHolder(var binding: ItemContactBinding):RecyclerView.ViewHolder(binding.root){

}