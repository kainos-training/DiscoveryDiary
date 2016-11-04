<#import "../layout.ftl" as layoutTemplate>

<@layoutTemplate.layout>

<h1>${media.title}</h1>

<dl class="table">

<img src="${media.imageUrl}" alt="${media.title} image" height="200px">
        <dt>Author</dt>
        <dd>
            ${media.author}
        </dd>
        <dt>Description</dt>
        <dd>
            ${media.description}
        </dd>
        <dt>Category</dt>
        <dd>
           ${media.category}
        </dd>
        <dt>Publication Date</dt>
        <dd>
            ${media.publicationDate}
        </dd>
        <dt>Status</dt>
        <dd>${media.status}
        </dd>
        <#if media.status == "On Loan">
        <dt>Loanee</dt>
        <dd>${media.nameOfBorrower}</dd>
        </#if>
        <#if media.status == "Available">
        <form action="${media.id}/borrow" method="post">
            <label for="nameOfBorrower">Name: </label>
            <input id="nameOfBorrower" type="text" name="nameOfBorrower">
            <input type="submit" name="Borrow">
        </form>
        </#if>
</dl>

</@layoutTemplate.layout>