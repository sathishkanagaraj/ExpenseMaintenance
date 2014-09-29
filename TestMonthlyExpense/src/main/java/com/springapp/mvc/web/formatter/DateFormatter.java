package com.springapp.mvc.web.formatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.format.Formatter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 27/5/14
 * Time: 8:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class DateFormatter implements Formatter<Date> {

    public DateFormatter() {
        super();
    }

    @Autowired
    private MessageSource messageSource;

    @Override
    public Date parse(String s, Locale locale) throws ParseException {
        final DateFormat dateFormat = createDateFormat(locale);
        return dateFormat.parse(s);
    }

    @Override
    public String print(Date date, Locale locale) {
        final DateFormat dateFormat = createDateFormat(locale);
        return dateFormat.format(date);
    }

    private DateFormat createDateFormat(final Locale locale) {
        final String format = this.messageSource.getMessage("date.format", null, locale);
        final DateFormat dateFormat = new SimpleDateFormat(format);
        dateFormat.setLenient(false);
        return dateFormat;
    }
}
