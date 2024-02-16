@import exercise.dto.posts.PostPage
@import exercise.util.NamedRoutes;
@param PostPage page

@template.layout.page(

content = @`
    <div class="mx-auto p-4 py-md-5">
        <main>
            !{var post = page.getPost();}
            <div>
                <p>${post.getId()}</p>
                <p>${post.getName()}</p>
                <p>${post.getBody()}</p>
            </div>
            <a href="${NamedRoutes.postsPath()}">Список постов</a>
        </main>
    </div>
`
)
