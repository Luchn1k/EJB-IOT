package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("            html,body,h1,h2,h3,h4,h5 {font-family: \"Raleway\", sans-serif}\n");
      out.write("\n");
      out.write("            .clickable{\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"listen()\">\n");
      out.write("\n");
      out.write("        <header class=\"w3-container\" style=\"padding-top:22px\">\n");
      out.write("            <h5><b><i class=\"fa fa-dashboard\"></i>National Train System</b></h5>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"w3-row-padding w3-margin-bottom\">\n");
      out.write("\n");
      out.write("            <div class=\"w3-quarter clickable\" onclick=\"openModel('location');\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"Click to see location history\">\n");
      out.write("                <div class=\"w3-container w3-red w3-padding-16\">\n");
      out.write("                    <div class=\"w3-left\"><i class=\"fa fa-map-marker w3-xxxlarge\" aria-hidden=\"true\"></i></div>\n");
      out.write("                    <div class=\"w3-right\">\n");
      out.write("                        <h3 id=\"location\"></h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"w3-clear\"></div>\n");
      out.write("                    <h4>Location</h4>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"w3-quarter clickable\" onclick=\"openModel('speed');\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"Click to see speed history\">\n");
      out.write("                <div class=\"w3-container w3-blue w3-padding-16\">\n");
      out.write("                    <div class=\"w3-left\"><i class=\"fa fa-dashboard w3-xxxlarge\"></i></div>\n");
      out.write("                    <div class=\"w3-right\">\n");
      out.write("                        <h3 id=\"speed\"></h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"w3-clear\"></div>\n");
      out.write("                    <h4>Speed</h4>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"w3-quarter clickable\" onclick=\"openModel('temp');\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"Click to see temperature history\">\n");
      out.write("                <div class=\"w3-container w3-teal w3-padding-16\">\n");
      out.write("                    <div class=\"w3-left\"><i class=\"fa fa-thermometer-empty w3-xxxlarge\" aria-hidden=\"true\"></i></div>\n");
      out.write("                    <div class=\"w3-right\">\n");
      out.write("                        <h3 id=\"temp\"></h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"w3-clear\"></div>\n");
      out.write("                    <h4>Temperature</h4>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"w3-quarter clickable\" onclick=\"openModel('humidity');\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"Click to see humidity history\">\n");
      out.write("                <div class=\"w3-container w3-orange w3-text-white w3-padding-16\">\n");
      out.write("                    <div class=\"w3-left\"><i class=\"fa fa-tint w3-xxxlarge\" aria-hidden=\"true\"></i></div>\n");
      out.write("                    <div class=\"w3-right\">\n");
      out.write("                        <h3 id=\"humidity\"></h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"w3-clear\"></div>\n");
      out.write("                    <h4>Humidity</h4>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--        All Models -->\n");
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"MainModle\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"MainModleLable\">Modal title</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\" id=\"MainModleBody\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type='text/javascript' src='/NTS_IOT_WEB/dwr/engine.js'></script>\n");
      out.write("        <script type='text/javascript' src='/NTS_IOT_WEB/dwr/interface/JMSListner.js'></script>\n");
      out.write("        <script type='text/javascript' src='/NTS_IOT_WEB/dwr/util.js'></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" ></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" ></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("                $(document).ready(function () {\n");
      out.write("                    $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                function openModel(name) {\n");
      out.write("                    switch (name) {\n");
      out.write("                        case \"location\":\n");
      out.write("                            $(\"#MainModleLable\").text(\"Location History\");\n");
      out.write("                            document.getElementById(\"MainModleBody\").innerHTML = location2;\n");
      out.write("                            $(\"#MainModle\").modal();\n");
      out.write("                            break;\n");
      out.write("\n");
      out.write("                        case \"speed\":\n");
      out.write("                            $(\"#MainModleLable\").text(\"Speed History\");\n");
      out.write("                            document.getElementById(\"MainModleBody\").innerHTML = speed;\n");
      out.write("                            $(\"#MainModle\").modal();\n");
      out.write("                            break;\n");
      out.write("                        case \"temp\":\n");
      out.write("                            $(\"#MainModleLable\").text(\"Temprature History\");\n");
      out.write("                            document.getElementById(\"MainModleBody\").innerHTML = temp;\n");
      out.write("                            $(\"#MainModle\").modal();\n");
      out.write("                            break;\n");
      out.write("                        case \"humidity\":\n");
      out.write("                            $(\"#MainModleLable\").text(\"Humidity History\");\n");
      out.write("                            document.getElementById(\"MainModleBody\").innerHTML = humidity;\n");
      out.write("                            $(\"#MainModle\").modal();\n");
      out.write("                            break;\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                let location2 = \"\";\n");
      out.write("                let speed = \"\";\n");
      out.write("                let temp = \"\";\n");
      out.write("                let humidity = \"\";\n");
      out.write("                function listen() {\n");
      out.write("                    JMSListner.MessageListner({\n");
      out.write("                        callback: function (str) {\n");
      out.write("                            let response = JSON.parse(str);\n");
      out.write("                            if (str !== \"\") {\n");
      out.write("                                let currentLocation = $(\"#location\").text();\n");
      out.write("                                if (currentLocation !== \"\") {\n");
      out.write("                                    location2 = location2 + \"<span>\" + currentLocation + \"</span><br><span>\";\n");
      out.write("                                }\n");
      out.write("                                let currentSpeed = $(\"#speed\").text();\n");
      out.write("                                if (currentLocation !== \"\") {\n");
      out.write("                                    speed = speed + \"<span>\" + currentSpeed + \"</span><br><span>\";\n");
      out.write("                                }\n");
      out.write("                                let currentTemp = $(\"#temp\").text();\n");
      out.write("                                if (currentLocation !== \"\") {\n");
      out.write("                                    temp = temp + \"<span>\" + currentTemp + \"</span><br><span>\";\n");
      out.write("                                }\n");
      out.write("                                let currentHumidity = $(\"#humidity\").text();\n");
      out.write("                                if (currentLocation !== \"\") {\n");
      out.write("                                    humidity = humidity + \"<span>\" + currentHumidity + \"</span><br><span>\";\n");
      out.write("                                }\n");
      out.write("\n");
      out.write("                            }\n");
      out.write("                            document.getElementById(\"temp\").innerHTML = response.temp + \"<span>&#8451;</span>\";\n");
      out.write("                            $(\"#humidity\").text(response.humidity + \" AH\");\n");
      out.write("                            $(\"#speed\").text(response.speed + \" Kmp/h\");\n");
      out.write("                            $(\"#location\").text(\"(\" + response.latitude + \", \" + response.longitude + \")\");\n");
      out.write("                            listen();\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
