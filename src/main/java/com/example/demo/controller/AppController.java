package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller

public class AppController {
    @GetMapping("/")
    public String mostarDatos(Model model) {
        ArrayList<Habilidad> habilidades = new ArrayList<>();

        Habilidad habilidad1 = new Habilidad("Ensamble de equipos de computo", "De acuerdo con la experiencia adquirida en mi técnica, puedo ensamblar y desarmar equipos de cómputo, cambiar sus componentes, realizar el mantenimiento de los equipos y más.", "1 año - Medio", "Manejo, mantenimiento ensamble y desarme de equipos.", "lol");
        Habilidad habilidad2 = new Habilidad("Diseño web con HTML/CSS", "Gracias a cursos y programas particulares, tengo experiencia en lenguajes de maquetado como lo son HTML y CSS, me gustaría complementar mi conocimiento con el backend y finalmente con bases de datos.", "5 Meses - Medio", "Desarrollo FrontEnd de aplicaciones web", "skloo");
        Habilidad habilidad3 = new Habilidad("Idioma ingles", "Gracias a que desde niño cree un ambiente en donde me rodeaba mucho del idioma inglés, termine aprendiéndolo y desarrollándolo de gran manera. Cumplo con todos los apartados. Pero debido a que nunca tuve manera de practicarlo de manera vocal, nunca pude desarrollar una buena pronunciación. Pero es algo en lo que me esfuerzo todos los días.", "7 años - Alto", "Traduccion, comunicacion", "skloo");
        Habilidad habilidad4 = new Habilidad("Python", "Gracias a cursos he podido aprender un poco sobre Python, ayudándome a crear algoritmos que utilizados en páginas de proyectos personales.", "3 Meses - bajo", "Secuencias de comandos", "skloo");
        Habilidad habilidad5 = new Habilidad("Java - SpringBoot", "A pesar de llevar poco tiempo y de que me falte mucho por aprender, tengo esto como habilidad que quiero desarrollar profundamente.", "2 Semanas - Muy bajo", "Desarrolo microservicios", "skloo");


        habilidades.add(habilidad1);
        habilidades.add(habilidad2);
        habilidades.add(habilidad3);
        habilidades.add(habilidad4);
        habilidades.add(habilidad5);

        model.addAttribute("habilidades", habilidades);
        return "inicio";
    }

    @GetMapping("/proyectos-personales")
    public String mostrarProyectos(Model model) {

        Informacion informacion = new Informacion();
        model.addAttribute("informacion", informacion);

        List<Caja> cajas = new ArrayList<>();
        cajas.add(new Caja("HeatSafe", "HeatSafe es un proyecto escolar que tiene como principal objetivo destacar en la competencia regional. Su misión, compartida por todos los participantes, consiste en abordar y resolver problemas regionales de importancia.\n" +
                "\n" +
                "El proyecto HeatSafe se materializa a través de una plataforma en línea que revoluciona la forma en que se aborda la comunicación en situaciones de incendios. Este enfoque permite evitar la congestión de llamadas y procedimientos engorrosos. Además, el equipo está trabajando en la expansión de sus funciones para mejorar aún más su utilidad, incluyendo la posible incorporación de cámaras térmicas y colaboraciones con las autoridades policiales correspondientes. También se está explorando una innovación que, si llegara a ser viable, representaría un avance significativo tanto para el proyecto como para la comunidad de Cali."));
        cajas.add(new Caja("DataSwift", "DataSwift es una plataforma diseñada para simplificar la transferencia de datos de manera rápida y eficiente, eliminando la necesidad de tediosos procesos de inicio de sesión y trámites engorrosos.\n" +
                "\n" +
                "Nuestra misión es proporcionar a los usuarios una solución sin complicaciones para compartir información de manera efectiva. Con DataSwift, puede transferir datos de un punto a otro en cuestión de segundos, sin tener que lidiar con registros innecesarios ni esperas prolongadas."));
        cajas.add(new Caja("EcoSolutions", "EcoSolutions es una plataforma comprometida con la sostenibilidad y la protección del medio ambiente. Su misión es brindar a individuos y empresas soluciones prácticas y efectivas para reducir su huella ecológica y contribuir al bienestar del planeta."));
        model.addAttribute("cajas", cajas);

        List<Imagen> imagenes = new ArrayList<>();
        imagenes.add(new Imagen("https://img.freepik.com/vector-premium/equipo-programacion_25147-63.jpg", "Primera imagen"));
        imagenes.add(new Imagen("https://plus.unsplash.com/premium_photo-1684522168034-32f22b4b7eef?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1932&q=80", "Segunda imagen"));
        imagenes.add(new Imagen("https://plus.unsplash.com/premium_photo-1682309652843-ed4eb60d473e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2112&q=80", "tercera imagen"));
        model.addAttribute("imagenes", imagenes);

        return "/proyectos-personales";

    }

    @GetMapping("/acerca")
    public String mostrarAcerca(Model model) {
        return "acerca";
    }

    @GetMapping("/contacto")
    public String mostrarContacto(Model model) {
        return "/contacto";
    }

    public class Habilidad {
        private String nombre;
        private String habilidad;
        private String tiempo;
        private String aplicaciones;
        private String consejo;

        public Habilidad(String nombre, String habilidad, String tiempo, String aplicaciones, String consejo) {
            this.nombre = nombre;
            this.habilidad = habilidad;
            this.tiempo = tiempo;
            this.aplicaciones = aplicaciones;
            this.consejo = consejo;
        }

        //Getter

        public String getNombre() {
            return nombre;
        }

        public String getHabilidad() {
            return habilidad;
        }

        public String getTiempo() {
            return tiempo;
        }

        public String getAplicaciones() {
            return aplicaciones;
        }

        public String getConsejo() {
            return consejo;
        }

        //Setter


        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setHabilidad(String habilidad) {
            this.habilidad = habilidad;
        }

        public void setTiempo(String tiempo) {
            this.tiempo = tiempo;
        }

        public void setAplicaciones(String aplicaciones) {
            this.aplicaciones = aplicaciones;
        }

        public void setConsejo(String consejo) {
            this.consejo = consejo;
        }


    }

    public class Informacion {
        private String titulo;

        public Informacion() {
            this.titulo = "Proyectos Personales";
        }

        //Getter

        public String getTitulo() {
            return titulo;
        }

        //Setter

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
    }
    public class Caja {
        private String tituloCaja;
        private String contenidoCaja;

        public Caja(String tituloCaja, String contenidoCaja) {
            this.tituloCaja = tituloCaja;
            this.contenidoCaja = contenidoCaja;

        }

        public String getTituloCaja() {
            return tituloCaja;
        }

        public void setTituloCaja(String tituloCaja) {
            this.tituloCaja = tituloCaja;
        }

        public String getContenidoCaja() {
            return contenidoCaja;
        }

        public void setContenidoCaja(String contenidoCaja) {
            this.contenidoCaja = contenidoCaja;
        }
    }

    public class Imagen {
        private String url;
        private String descripcion;

        public Imagen(String url, String descripcion) {
            this.url = url;
            this.descripcion = descripcion;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    }

}
