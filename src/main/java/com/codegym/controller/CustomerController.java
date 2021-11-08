package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping
    public ModelAndView listCustomer() {
        ModelAndView modelAndView = new ModelAndView("/customer/list");

        return modelAndView;
    }

    @GetMapping("/info/{id}")
    public ModelAndView showFormInfo(@PathVariable Long id) {
        Optional<Customer> customer = customerService.findById(id);

        if(customer.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("customers/info");
            modelAndView.addObject("customer", customer.get());
            modelAndView.addObject("success", null);
            return modelAndView;
        } else {
            return new ModelAndView("error.404");
        }
    }
}