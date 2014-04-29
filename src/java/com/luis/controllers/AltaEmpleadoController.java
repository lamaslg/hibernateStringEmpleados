/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.luis.controllers;

import com.luis.model.viewforms.EmpleadosViewForm;
import com.luis.servicios.ManagerEmpleados;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pojos.Empleado;
import pojos.Puesto;

/**
 *
 * @author luis
 */
@Controller
@RequestMapping(value = "/AltaEmpleado.htm")
public class AltaEmpleadoController {
    
    @Autowired
    private ManagerEmpleados managerEmpleados;

    public ManagerEmpleados getManagerEmpleados() {
        return managerEmpleados;
    }

    public void setManagerEmpleados(ManagerEmpleados managerEmpleados) {
        this.managerEmpleados = managerEmpleados;
    }
    
    @RequestMapping(method = RequestMethod.POST)
    protected String onSubmit(EmpleadosViewForm empleado,
            BindingResult result){
    
          if(result.hasErrors())
              return "AltaEmpleado";
    
          Puesto p=new Puesto();
          p.setIdPuesto(1);
          Empleado em=new Empleado();
          em.setNombre(empleado.getNombre());
          em.setSalario(empleado.getSalario());
          em.setPuesto(p);
          
          managerEmpleados.addEmpleado(em);
          
          return "redirect:/empleados.htm";
    
    }
    
    @RequestMapping(method = RequestMethod.GET)
    protected EmpleadosViewForm formBackingObject
                    (HttpServletRequest req)throws Exception{
        EmpleadosViewForm empleado=new EmpleadosViewForm();
        empleado.setSalario(new Double(35000));
        req.setAttribute("empleado", empleado);
        return empleado;
        
        }
    
    
}

















