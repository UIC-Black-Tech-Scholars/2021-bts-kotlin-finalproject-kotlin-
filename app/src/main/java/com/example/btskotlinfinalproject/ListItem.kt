package com.example.btskotlinfinalproject

class ListItem(t:String?, f:String?, d:String?, p:String?) {
    var org_name:String?=null
    var email:String?=null
    var description:String?=null
    var logo:String?=null

    init {
        org_name = t
        email = f
        description = d
        logo = p
    }

    override fun toString(): String =  logo + ":" +org_name + ":" + email + ":" + description.toString()
}
