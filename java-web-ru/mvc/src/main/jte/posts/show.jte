@import exercise.dto.posts.PostPage
@param PostPage page

@template.layout.page(
    content = @`
        <main>
            <div class="mx-auto p-4 py-md-5">
                <h1>${page.getPost().getName()}</h1>
            </div>

            <div class="mx-auto p-4 py-md-5">
                ${page.getPost().getBody()}
            </div>
            <!-- BEGIN -->
            !{var post = page.getPost();}
            <div class="mx-auto p-4 py-md-5">
                <form id="edit" action="/posts/${post.getId()}/edit" method="get">
                    <input type="submit" class="btn btn-primary" value="Изменить" />
                </form>
            </div>
            <!-- END -->
        </main>
    `
)
