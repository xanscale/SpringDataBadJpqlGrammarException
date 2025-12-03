package com.example.demo

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany

@Entity
class A(
    @Id @GeneratedValue var id: Long? = null,
    @ManyToOne var b: B? = null
)

@Entity
class B(
    @Id @GeneratedValue var id: Long? = null,
    @ManyToOne var c: C? = null
) {
    @OneToMany(mappedBy = "b")
    var aaa: MutableSet<A> = mutableSetOf()
}

@Entity
class C(
    @Id @GeneratedValue var id: Long? = null,
){
    @OneToMany(mappedBy = "c")
    var bbb: MutableSet<B> = mutableSetOf()
}