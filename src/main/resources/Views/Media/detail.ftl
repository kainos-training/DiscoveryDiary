
<#import "../layout.ftl" as layoutTemplate>

<@layoutTemplate.layout>

<h1>${media.title}</h1>

<dl class="table">
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
</dl>

</@layoutTemplate.layout>