package com.easy.kotlin.demo.entity.controller

import com.easy.kotlin.demo.entity.ArticleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
class ArticleController {
    @Autowired
    val articleRepository:ArticleRepository?=null
}