 <%@ page contentType="text/html; charset=UTF-8" %>
<div id="content">
  <div class="line-hor"></div>
  <div class="box">
        <div class="inner">
          <div class="detalii-sitemap">
          <h3>Site <span>Map</span></h3>
          <p>Aici puteți accesa ușor link-urile din site:</p>
          <ul class="sitemap-list">
              <li><a href="#" onclick="loadDoc('acasa.jsp')">Acasă</a></li>
              <li><a href="#" onclick="loadDoc('despre.jsp')">Despre</a></li>
              <li><a href="#" onclick="loadDoc('filme.jsp')">Filme</a></li>
              <li><a href="#" onclick="loadDoc('filme.jsp')">Lista Filme</a>
               	 <ul>
                    
					<li id="lista"></li>

               </ul> 

              <li><a href="#" onclick="loadDoc('contact.jsp')">Contact</a></li>
              <li><a href="#" onclick="loadDoc('sitemap.jsp')">Site Map</a></li>
          </ul>
        </div>
        </div>
      </div>
</div>