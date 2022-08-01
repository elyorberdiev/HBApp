package com.example.hbapp.domain

import com.example.hbapp.core.Abstract
import com.example.hbapp.presentation.BookUi

sealed class BookDomain: Abstract.Object<BookUi, Abstract.Mapper.Empty>() {
}