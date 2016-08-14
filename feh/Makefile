VERSION	= 0.9.1

CFLAGS	+= -W -Wall -Wextra -Werror \
	-DVERSION=\"$(VERSION)\" \
	-g

all: atinout

atinout: atinout.c
	$(CC) -o $@ $(CFLAGS) $(LDFLAGS) $^

clean:
	rm -f atinout
