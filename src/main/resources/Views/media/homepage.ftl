

<#import "../layout.ftl" as layoutTemplate>

<@layoutTemplate.layout>
<div class="row">
 <#list medias as media>



<div class="col s12 m6 l4">
<a href="/media/${media.id}">
            <div class="card">
              <div class="card-image waves-effect waves-block waves-light">
                <img class="activator" src="${media.imageUrl}">
              </div>
              <div class="card-content">
                <span class="card-title activator grey-text text-darken-4">${media.title}</span>


              </div>
              <div class="card-reveal">
                <span class="card-title grey-text text-darken-4">${media.title}</span>

              </div>
            </div>
          </div>
          </a>

           </#list>
           </div>



</@layoutTemplate.layout>