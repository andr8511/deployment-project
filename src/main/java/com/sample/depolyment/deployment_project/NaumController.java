package com.sample.depolyment.deployment_project;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.http.HttpRequest;

@Controller
public class NaumController {

    @GetMapping("/")
    public String getNetworkInfo(HttpServletRequest request, Model model) {
        try {
            // Получаем имя хоста (название устройства)
            String hostName = InetAddress.getLocalHost().getHostName();
            // Получаем IP адрес устройства
            String ipAddress = request.getRemoteAddr();

            model.addAttribute("hostName", hostName);
            model.addAttribute("ipAddress", ipAddress);
        } catch (UnknownHostException e) {
            model.addAttribute("hostName", "Не удалось получить имя устройства");
            model.addAttribute("ipAddress", "Не удалось получить IP адрес");
        }
        return "index";
    }
}
