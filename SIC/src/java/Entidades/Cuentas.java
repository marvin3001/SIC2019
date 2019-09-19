package Entidades;
// Generated 09-12-2019 05:40:04 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Cuentas generated by hbm2java
 */
@Entity
@Table(name="cuentas"
    ,schema="public"
)
public class Cuentas  implements java.io.Serializable {


     private String cuenta;
     private String nombre;
     private String tipo;
     private int nivel;
     private String saldo;
     private String padre;
     private Set<Transacciones> transaccioneses = new HashSet<Transacciones>(0);

    public Cuentas() {
    }

	
    public Cuentas(String cuenta, String nombre, String tipo, int nivel, String saldo) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.saldo = saldo;
    }
    public Cuentas(String cuenta, String nombre, String tipo, int nivel, String saldo, String padre, Set<Transacciones> transaccioneses) {
       this.cuenta = cuenta;
       this.nombre = nombre;
       this.tipo = tipo;
       this.nivel = nivel;
       this.saldo = saldo;
       this.padre = padre;
       this.transaccioneses = transaccioneses;
    }
   
     @Id 

    
    @Column(name="cuenta", unique=true, nullable=false, length=20)
    public String getCuenta() {
        return this.cuenta;
    }
    
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    
    @Column(name="nombre", nullable=false, length=30)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="tipo", nullable=false, length=20)
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    @Column(name="nivel", nullable=false)
    public int getNivel() {
        return this.nivel;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    
    @Column(name="saldo", nullable=false, length=20)
    public String getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    
    @Column(name="padre", length=20)
    public String getPadre() {
        return this.padre;
    }
    
    public void setPadre(String padre) {
        this.padre = padre;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cuentas")
    public Set<Transacciones> getTransaccioneses() {
        return this.transaccioneses;
    }
    
    public void setTransaccioneses(Set<Transacciones> transaccioneses) {
        this.transaccioneses = transaccioneses;
    }




}


