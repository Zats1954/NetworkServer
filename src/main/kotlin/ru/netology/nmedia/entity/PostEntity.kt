package ru.netology.nmedia.entity

import ru.netology.nmedia.dto.Post
import javax.persistence.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

@Entity
data class PostEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
        var author: String,
        var published: String,
        var content: String,
        var likedByMe: Boolean,
        var likes: Int = 0,
        var shares: Int = 0,
        var visibles: Int = 0,
        var videoVisibility: Int = 4,
        var video: String? = " "
  ) {
    fun toDto() = Post(id, author, published, content, likedByMe, likes,shares,
                           visibles,
                           videoVisibility,
                           video)

    companion object {
        fun fromDto(dto: Post) = PostEntity(dto.id, dto.author, dto.published,
                                 dto.content,
                                 dto.likedByMe,
                                 dto.likes,
                                 dto.shares,
                                 dto.visibles,
                                 dto.videoVisibility,
                                 dto.video )
    }
}