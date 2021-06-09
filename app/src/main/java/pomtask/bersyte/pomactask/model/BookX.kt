package com.bersyte.paging3.model

data class BookX(
    val age_group: String,
    val amazon_product_url: String,
    val article_chapter_link: String,
    val author: String,
    val book_image: String,
    val book_image_height: Int,
    val book_image_width: Int,
    val book_review_link: String,
    val book_uri: String,
    val contributor: String,
    val contributor_note: String,
    val created_date: String,
    val description: String,
    val first_chapter_link: String,
    val price: String,
    val primary_isbn10: String,
    val primary_isbn13: String,
    val publisher: String,
    val rank: Int,
    val rank_last_week: Int,
    val sunday_review_link: String,
    val title: String,
    val updated_date: String,
    val weeks_on_list: Int
)